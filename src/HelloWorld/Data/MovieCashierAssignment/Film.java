package HelloWorld.Data.MovieCashierAssignment;

public class Film {
    private double Price;
    public double GetPrice(){
        return Price;
    }

    private String Name;
    public String GetName(){
        return Name;
    }
    public void SetName(String _Name){
        Name = _Name;
    }

    public Film(double _Price, String _Name){
        Price = _Price;
        SetName(_Name);
    }
}
