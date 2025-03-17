package HelloWorld.Data.Math;

public class Point {
    private double x;
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    private double y;
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

}
