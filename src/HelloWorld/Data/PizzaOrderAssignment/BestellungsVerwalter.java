package HelloWorld.Data.PizzaOrderAssignment;

public class BestellungsVerwalter {
    public static int Bestellungen = 0;
    public static int GetBestellungen(){
        return Bestellungen;
    }

    public static Kunde CreateCustomer(String name){
        return new Kunde(name);
    }

    public static Bestellung CreateOrder(String pizza, Kunde kunde){
        BestellungsVerwalter.Bestellungen++;
        System.out.printf("\nKunde %s bestellt eine %s!\n", kunde.GetName(), pizza);
        return new Bestellung(pizza, kunde);
    }
}
