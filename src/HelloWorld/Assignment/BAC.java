package HelloWorld.Assignment;

import java.util.*;

public class BAC {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, Double> BodyDistributionFactor = new HashMap<String, Double>(){
        {
            put("m", 0.7);
            put("f", 0.6);
            put("k", 0.8);
        }
    };
    public static void Run(){
        double c, A, r, m, V, €, p;

        System.out.print("Die masse der Person in [kg]: ");
        m = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.print("Gib deinen Verteilungsfaktor ein (m - Mann, f - Frau, k - Kind): ");
        r = BodyDistributionFactor.get(scanner.next().toLowerCase());

        System.out.print("Gib die Volumen des Getränks ein in [ml]: ");
        V = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.print("Gib den Alkoholvolumenanteil in [%] an: ");
        € = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.print("Gib die Dichte vom Alkohol in [g/ml] an: ");
        p = Double.parseDouble((scanner.next()).replace(',', '.'));

        A = V * € * p;

        c = A / (m * r);

        System.out.printf("Promille wert: [%.5f g/kg] ≈ %.2f Promille\n", c, c);
    }
}
