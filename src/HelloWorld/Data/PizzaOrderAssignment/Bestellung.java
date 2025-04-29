package HelloWorld.Data.PizzaOrderAssignment;

public class Bestellung {
    public String _Pizza;
    public Kunde _Kunde;

    public Bestellung(String pizza, Kunde kunde){
        _Pizza = pizza;
        _Kunde = kunde;
    }
}
