import java.util.Scanner;

public class Main {

    public static double CelsiusTillFahrenheit(double Celsius) {
        return (Celsius * 1.8) + 32;

    }

    public static double CelsiusTillKelvin(double Celsius) {
        return Celsius + 273.15;

    }

    public static double fahrenheitTillCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;

    }

    public static double fahrenheitTillKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) / 1.8;

    }

    public static double kelvinTillFahrenheit(double kelvin) {
        return (kelvin * 1.8) - 459.67;

    }

    public static double kelvinTillCelcius(double kelvin) {
        return kelvin - 273.15;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ange temperaturen i Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = CelsiusTillFahrenheit(celsius);
        double kelvin = CelsiusTillKelvin(celsius);

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");

        celsius = kelvinTillCelcius(kelvin);
        System.out.println(kelvin + " K = " + celsius + "°C");

    }
}