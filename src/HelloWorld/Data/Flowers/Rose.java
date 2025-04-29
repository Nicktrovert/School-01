package HelloWorld.Data.Flowers;

public class Rose extends Flower {
    public Rose(int MaxGrowthStage, String color, String family, double[] Size) {
        super(MaxGrowthStage, color, family, Size);
    }

    public Rose(int MaxGrowthStage, String[] colors, String family, double[] Size){
        super(MaxGrowthStage, colors, family, Size);
    }

    @Override
    public void Grow(){
        GrowthStage++;
        Size[1] += 1.35;
    }
}
