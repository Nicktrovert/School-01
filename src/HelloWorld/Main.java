package HelloWorld;

import HelloWorld.Assignment.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, Object> assignments = new HashMap(){
        {
            put("cowsay", (Object) new CowSay());
            put("benzin", new Benzin());
            put("stoffwechsel", new Stoffwechsel());
            put("summe", new Summe());
            put("bac", new BAC());
        }
    };

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String ChosenAssignment = (scanner.next()).toLowerCase();
        assignments.get(ChosenAssignment).getClass().getMethod("Run").invoke(assignments.get(ChosenAssignment));
    }
}
