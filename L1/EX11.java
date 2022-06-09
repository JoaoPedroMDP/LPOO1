package L1;

import java.util.Scanner;

public class EX11 {
    public static void main(String args[]) {
        if (args.length != 0) {
            System.out.println("Este programa nao possui argumentos!");
            System.exit(1);
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Dado A: ");
        int a = s.nextInt();
        System.out.print("Dado B: ");
        int b = s.nextInt();
        if (a >= b)
            System.out.println("Resultado: " + a);
        else
            System.out.println("Resultado: " + b);
    }
}
