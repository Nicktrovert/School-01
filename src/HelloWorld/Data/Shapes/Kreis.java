package HelloWorld.Data.Shapes;

public class Kreis{
    private double radius;
    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public double GetArea(){
        return Math.PI * (radius * radius);
    }

    public double GetUmfang(){
        return 2 * Math.PI * radius;
    }
}
