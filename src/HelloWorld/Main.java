package HelloWorld;

import HelloWorld.Assignment.*;
import HelloWorld.Other.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, Object> assignments = new HashMap<>(){
        {
            put("cowsay", new CowSay());
            put("benzin", new Benzin());
            put("benzin2", new Benzin2());
            put("bestell2", new Bestell2());
            put("brief", new Brief());
            put("kindergeld", new Kindergeld());
            put("stoffwechsel", new Stoffwechsel());
            put("summe", new Summe());
            put("bac", new BAC());
            put("temperatur", new Temperatur());
            put("warnung1", new Warnung1());
            put("warnung4", new Warnung4());
            put("warnung5", new Warnung5());
            put("calc", new Calculator());
            put("maximum", new maximum());
            put("monname", new MonName());
            put("kehrwert", new Kehrwert());
            put("zahlinfo", new ZahlInfo());
        }
    };

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.print("Please enter the assignment you want to run: ");
        String ChosenAssignment = (scanner.next()).toLowerCase();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        if (assignments.containsKey(ChosenAssignment)){
            assignments.get(ChosenAssignment).getClass().getMethod("Run").invoke(assignments.get(ChosenAssignment));
        }
        else{
            System.out.println("\nInvalid assignment. Please try again!");
            main(args);
        }
    }
}
