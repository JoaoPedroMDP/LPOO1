package L5.EX8;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Conversor conversor = new Conversor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a origem (C, F ou K):");
        String origem = sc.nextLine();
        System.out.println("Digite o valor:");
        double valor = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a destino (C, F ou K):");
        String destino = sc.nextLine();

        switch (origem) {
            case "C":
                System.out.println(fromCelsius(valor, destino, conversor));
                break;
            case "F":
                System.out.println(fromFahrenheit(valor, destino, conversor));
                break;
            case "K":
                System.out.println(fromKelvin(valor, destino, conversor));
                break;
        }
    }

    public static double fromCelsius(double valor, String destino, Conversor conversor){
        double convertido = 0d;
        switch (destino) {
            case "F":
                convertido = conversor.celsiusFahrenheit(valor);
                break;
            case "K":
                convertido = conversor.celsiusKelvin(valor);
                break;
        }

        return convertido;
    }

    public static double fromFahrenheit(double valor, String destino, Conversor conversor){
        double convertido = 0d;
        switch (destino) {
            case "C":
                convertido = conversor.fahrenheitCelsius(valor);
                break;
            case "K":
                convertido = conversor.fahrenheitKelvin(valor);
                break;
        }

        return convertido;
    }

    public static double fromKelvin(double valor, String destino, Conversor conversor){
        double convertido = 0d;
        switch (destino) {
            case "C":
                convertido = conversor.kelvinCelsius(valor);
                break;
            case "F":
                convertido = conversor.kelvinFahrenheit(valor);
                break;
        }

        return convertido;
    }
}