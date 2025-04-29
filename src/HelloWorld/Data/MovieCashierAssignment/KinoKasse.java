package HelloWorld.Data.MovieCashierAssignment;

import java.util.List;

public class KinoKasse {
    private static double Income = 0;
    public static double GetIncome(){
        return Income;
    }

    public Film[] Filme = {
            new Film(9.00, "365 Days"),
            new Film(9.50, "Blue Lagoon"),
            new Film(8.50, "Conjuring"),
            new Film(9.99, "Findet Nemo"),
            new Film(11.00, "Tusk"),
    };

    public void BuyTicket(int FilmNummer){
        System.out.printf("Ticket für \"%s\" verkauft!", Filme[FilmNummer].GetName());
        Income += Filme[FilmNummer].GetPrice();
    }
}
