import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Enter temperature in Celsius");
        System.out.println("2. Enter temperature in Fahrenheit");
        System.out.println("3. Enter temperature in Kelvin");
        System.out.print("Choose an option (1, 2 or 3): ");
        int choice = scanner.nextInt();
        double  celsius, fahrenheit, kelvin;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                System.out.printf("%.2f Celsius is : \n\t%.2f Fahrenheit  \n\t %.2f Kelvin\n", celsius, fahrenheit, kelvin);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                System.out.printf("%.2f Fahrenheit is :\n\t %.2f Celsius \n\t %.2f Kelvin\n", fahrenheit, celsius, kelvin);
                break;
            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = scanner.nextDouble();
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                System.out.printf("%.2f Kelvin is : \n\t %.2f Celsius \n\t %.2f Fahrenheit\n", kelvin, celsius, fahrenheit);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}