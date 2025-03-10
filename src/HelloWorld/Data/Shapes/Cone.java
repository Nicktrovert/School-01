package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

import java.util.Date;
import java.util.Scanner;

public class Cone implements Shape {

    private double Radius;

    public void setRadius(double Radius){
        this.Radius = Radius;
    }
    public void setRadius(int Radius) { this.Radius = Radius; }
    public void setRadius(String Radius){
        this.Radius = Double.parseDouble(Radius);
    }
    public void setRadius(boolean Radius){
        if (Radius){
            this.Radius = 1;
        } else{
            this.Radius = 0;
        }
    }
    public void setRadius(Date Radius){
        this.Radius = Double.parseDouble(Radius.getTime() + "." + Radius.getTime());
    }
    public void setRadius(Cone cone){
        this.Radius = cone.Radius;
    }
    public void setRadius(Scanner scanner){
        System.out.println("enter a radius: ");
        this.Radius = scanner.nextDouble();
    }

    private double Height;

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
