package HelloWorld.Assignment;

import HelloWorld.Data.Shape;
import HelloWorld.Data.Shapes.*;

import java.util.Scanner;

public class Koerper {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        try{
            System.out.println("Berechnung von Volumen / Oberfläche div . Koerper");
            System.out.print("\nBitte wählen sie (Z)ylinder, (W)ürfel, (Q)uader, (K)reis-kegel oder K(u)gel: ");

            String input = scanner.next();

            Shape shape = switch (input.toLowerCase().charAt(0)) {
                case 'z' -> new Cylinder(RequestDouble("Radius in cm"), RequestDouble("Höhe in cm"));
                case 'w' -> new Cube(RequestDouble("Kantenlänge in cm"));
                case 'q' -> new Cuboid(RequestDouble("Breite in cm"), RequestDouble("Höhe in cm"), RequestDouble("Tiefe in cm"));
                case 'k' -> new Cone(RequestDouble("Radius in cm"), RequestDouble("Höhe in cm"));
                case 'u' -> new Sphere(RequestDouble("Radius in cm"));
                default -> throw new IllegalArgumentException();
            };

            System.out.printf("\n%s Oberfläche: %.2f cm²\n", shape.GetName(), shape.GetArea());
            System.out.printf("%s Volumen: %.2f cm³\n", shape.GetName(), shape.GetVolume());
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }

    public double RequestDouble(String requestMessage){
        System.out.printf("%s: ", requestMessage);
        return Double.parseDouble((scanner.next()).replace(',', '.'));
    }
}
