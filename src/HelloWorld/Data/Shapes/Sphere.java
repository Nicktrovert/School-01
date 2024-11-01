package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Sphere implements Shape {

    public double Radius;

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
