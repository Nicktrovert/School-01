package HelloWorld.Data.PizzaOrderAssignment;

public class Kunde {
    private String _Name;
    public String GetName(){
        return _Name;
    }
    public void SetName(String Name){
        _Name = Name;
    }

    public Kunde(String Name){
        SetName(Name);
    }
}
