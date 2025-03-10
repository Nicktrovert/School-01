package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Cone implements Shape {

    public double Radius;

    public void setRadius(double Radius){
        this.Radius = Radius;
    }

    public double Height;

    public void setHeight(double Height){
        this.Height = Height;
    }

    public Cone(double radius, double height){
        Radius = radius;
        Height = height;
    }

    @Override
    public String GetName() {
        return "Kreis-kegel";
    }

    @Override
    public double GetVolume() {
        return (((double) 1 / 3) * Math.PI * (Radius * Radius) * Height);
    }

    @Override
    public double GetArea() {
        return (((Radius * Radius) * Math.PI) + (Radius * Math.PI * Math.sqrt((Radius * Radius) + (Height * Height))));
    }

    public double GetMantel(){
        return (Math.PI * Radius * Math.sqrt((Height * Height) + (Radius * Radius)));
    }
}
