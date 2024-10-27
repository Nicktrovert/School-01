package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Cylinder implements Shape {

    public double Radius = 0;
    public double Height = 0;

    public Cylinder(double radius, double height){
        Radius = radius;
        Height = height;
    }

    @Override
    public String GetName() {
        return "Zylinder";
    }

    @Override
    public double GetVolume() {
        return Height * Math.PI * (Radius * Radius);
    }

    @Override
    public double GetArea() {
        return (2 * Math.PI * (Radius * Radius)) + (2 * Math.PI * Radius * Height);
    }
}
