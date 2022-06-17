package L5.EX8;

public class Conversor {

    public static double celsiusKelvin(double valor){
        System.out.println("Celsius para Kelvin");
        return valor + 273.15;
    }

    public static double celsiusFahrenheit(double valor){
        System.out.println("Celsius para Fahrenheit");
        return valor * 1.8 + 32;
    }

    public static double kelvinCelsius(double valor){
        System.out.println("Kelvin para Celsius");
        return valor - 273.15;
    }

    public static double kelvinFahrenheit(double valor){
        System.out.println("Kelvin para Fahrenheit");
        return (valor - 273.15) * 1.8 + 32;
    }

    public static double fahrenheitCelsius(double valor){
        System.out.println("Fahrenheit para Celsius");
        return (valor - 32) / 1.8;
    }

    public static double fahrenheitKelvin(double valor){
        System.out.println("Fahrenheit para Kelvin");
        return (valor - 32) / 1.8 + 273.15;
    }
}