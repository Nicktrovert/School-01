package HelloWorld.Data.Shapes;

import HelloWorld.Data.Shape;

public class Cuboid implements Shape {

    private double Width;
    public void setWidth(double Width){
        this.Width = Width;
    }
    public double Height;
    public void setHeight(double Height){
        this.Height = Height;
    }
    public double Depth;
    public void setDepth(double Depth){
        this.Depth = Depth;
    }

    public Cuboid(double width, double height, double depth){
        Width = width;
        Height = height;
        Depth = depth;
    }

    @Override
    public String GetName() {
        return "Quader";
    }

    @Override
    public double GetVolume() {
        return Width * Height * Depth;
    }

    @Override
    public double GetArea() {
        return ((2 * Width * Height) + (2 * Width * Depth) + (2 * Height * Depth));
    }
}