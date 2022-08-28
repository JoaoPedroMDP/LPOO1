package L7.EX5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String buffer = "";
        Integer number = 0, soma = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        buffer = sc.nextLine();
        while (!buffer.equals("S") && !buffer.equals("s")) {
            try {
                number = Integer.parseInt(buffer);
                soma += number;

                count++;
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido");
            }

            buffer = sc.nextLine();
        }
        sc.close();
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma / count);
    }
}
