import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String arg[]){
        int n;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n = ");
        n = scanner.nextInt();
        ArrayList<MyPoint> listPoint = new ArrayList<>();
        for (int i=0; i<n ; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            MyPoint p = new MyPoint(x, y);
            listPoint.add(p);
        }
        MyPoint point = new MyPoint();
        double valueMax = 0;
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i< n-1; i ++){
            for(int j= i+1; j< n; j++){
                if(point.distance(listPoint.get(i), listPoint.get(j)) > valueMax){
                    valueMax = point.distance(listPoint.get(i), listPoint.get(j));
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("khoang cach max = "+valueMax);
        System.out.println("toa do diem 1 = "+listPoint.get(index1).getX()+" "+listPoint.get(index1).getY());
        System.out.println("toa do diem 2 = "+listPoint.get(index2).getX()+" "+listPoint.get(index2).getY());
    }
}
