public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(MyPoint secondPoint){
        return Math.sqrt(Math.pow((secondPoint.x - this.x), 2)+ Math.pow((secondPoint.y - this.y), 2));
    }

    public double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow((p1.x - p2.x), 2)+ Math.pow((p1.y - p2.y), 2));
    }

}
