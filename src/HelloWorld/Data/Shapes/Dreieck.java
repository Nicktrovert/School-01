package HelloWorld.Data.Shapes;

public class Dreieck {
    public double seiteA;
    public void SetseiteA(double seiteA){
        this.seiteA = seiteA;
    }
    public double seiteB;
    public void SetseiteB(double seiteB){
        this.seiteB = seiteB;
    }
    public double seiteC;
    public void SetseiteC(double seiteC)
    {
        this.seiteC = seiteC;
    }

    public double GetArea(){
        double s = GetUmfang() / 2;
        return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
    }

    public double GetUmfang(){
        return (seiteA + seiteB + seiteC);
    }
}
