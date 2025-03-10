package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Cylinder implements Shape {

    private double Radius;
    public void setRadius(double Radius){
        this.Radius =Radius;
    }
    private double Height;
    public void setHeight(double Height){
        this.Height = Height;
    }

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
