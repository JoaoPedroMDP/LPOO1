package L3;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Integer numeroAmostras = 0;
        Scanner sc = new Scanner(System.in);
        Float media = 0f, somatorio = 0f;

        numeroAmostras = sc.nextInt();
        Float[] amostras = new Float[numeroAmostras];
        
        for(Integer i = 0; i < numeroAmostras; i++){
            amostras[i] = sc.nextFloat();
            media += amostras[i]/numeroAmostras;
        }
        sc.close();

        for(Integer i = 0; i < numeroAmostras; i++){
            somatorio += (float) Math.pow(amostras[i] - media, 2);
        }

        System.out.printf("%.2f\n", Math.sqrt(somatorio/numeroAmostras));
    }
}
