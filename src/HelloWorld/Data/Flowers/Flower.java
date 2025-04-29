package HelloWorld.Data.Flowers;

public class Flower {
    String[] Colors;
    int GrowthStage;
    int MaxGrowthStage;
    float GrowthRate;
    String Family;
    double[] Size;

    public Flower(int MaxGrowthStage, String color, String family, double[] Size){
        this.Colors = new String[]{color};
        this.MaxGrowthStage = MaxGrowthStage;
        this.Family = family;
    }

    public Flower(int MaxGrowthStage, String[] colors, String family, double[] Size){
        this.Colors = colors;
        this.MaxGrowthStage = MaxGrowthStage;
        this.Family = family;
    }

    public void Grow(){
        GrowthStage++;
        Size[1] += GrowthRate;
    }

    public boolean IsBlooming(){
        return GrowthStage >= MaxGrowthStage;
    }

}
