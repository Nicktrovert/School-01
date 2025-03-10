package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Cube implements Shape {

    public double Length;

    public void setLength(double Length){
        this.Length = Length;
    }

    public Cube(double length){
        Length = length;
    }

    @Override
    public String GetName() {
        return "Würfel";
    }

    @Override
    public double GetVolume() {
        return Length * Length * Length;
    }

    @Override
    public double GetArea() {
        return 6 * Length * Length;
    }
}
