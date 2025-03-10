package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Sphere implements Shape {

    private double Radius;
    public void setRadius(double Radius){
        this.Radius = Radius;
    }

    public Sphere(double radius){
        Radius = radius;
    }

    @Override
    public String GetName() {
        return "Kugel";
    }

    @Override
    public double GetVolume() {
        return ((double) 4 / 3) * Math.PI * (Radius * Radius * Radius);
    }

    @Override
    public double GetArea() {
        return 4 * Math.PI * (Radius * Radius);
    }
}
