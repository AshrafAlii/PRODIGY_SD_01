import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperatureValue = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unitType = scanner.next().trim().toUpperCase().charAt(0);

        switch (unitType) {
            case 'C':
                displayConversionsFromCelsius(temperatureValue);
                break;
            case 'F':
                displayConversionsFromFahrenheit(temperatureValue);
                break;
            case 'K':
                displayConversionsFromKelvin(temperatureValue);
                break;
            default:
                System.out.println("Error: Invalid unit of measurement entered.");
                break;
        }

        scanner.close();
    }

    public static void displayConversionsFromCelsius(double celsiusValue) {
        double toFahrenheit = (celsiusValue * 9/5) + 32;
        double toKelvin = celsiusValue + 273.15;
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit and %.2f Kelvin%n", celsiusValue, toFahrenheit, toKelvin);
    }

    public static void displayConversionsFromFahrenheit(double fahrenheitValue) {
        double toCelsius = (fahrenheitValue - 32) * 5/9;
        double toKelvin = toCelsius + 273.15;
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius and %.2f Kelvin%n", fahrenheitValue, toCelsius, toKelvin);
    }

    public static void displayConversionsFromKelvin(double kelvinValue) {
        double toCelsius = kelvinValue - 273.15;
        double toFahrenheit = (toCelsius * 9/5) + 32;
        System.out.printf("%.2f Kelvin is equal to %.2f Celsius and %.2f Fahrenheit%n", kelvinValue, toCelsius, toFahrenheit);
    }
}
