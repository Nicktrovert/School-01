package HelloWorld.Data;

public class Temperature {
    private final double _temp;

    public Temperature(double Temperature) {
        if (Temperature < -273.15){
            throw new IllegalArgumentException(String.format("%s is less than absolute zero.", Temperature));
        }
        _temp = Temperature;
    }

    public double GetCelsius(){
        return _temp;
    }
    public double GetFahrenheit() {
        return (_temp * 9 / 5) + 32;
    }
    public double GetKelvin() {
        return _temp + 273.15;
    }

    public static Temperature Parse(String s)
    {
        if (s.isEmpty())
            throw new IllegalArgumentException("String to parse was empty.");

        String Format = s.substring(s.length() - 1);

        double NumbersOnly = Double.parseDouble(s.substring(0, s.length() - 2).replace(",", "."));
        return switch (Format.toUpperCase()){
            case "C" -> new Temperature(NumbersOnly);
            case "F" -> new Temperature(NumbersOnly - (double) (32 * 5 / 9));
            case "K" -> new Temperature(NumbersOnly - 273.15);
            default -> throw new IllegalArgumentException();
        };
    }
}
