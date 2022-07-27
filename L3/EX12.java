package L3;

import java.util.Scanner;

public class EX12 {

    private static void pegaMatriz(Scanner sc, Float matriz[][]) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextFloat();
            }
        }
    }

    private static Float soma(Float matriz[][], Boolean principal) {
        Float soma = 0f;
        if (principal) {
            for (Integer i = 0; i < matriz[0].length; i++) {
                soma += matriz[i][i];
            }
        } else {
            for (Integer i = 0; i < matriz[0].length; i++) {
                soma += matriz[matriz.length - i - 1][i];
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        Integer dimensao = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a dimensão da matriz: ");
        dimensao = sc.nextInt();
        Float[][] matriz = new Float[dimensao][dimensao];

        // Pega matriz do input
        pegaMatriz(sc, matriz);

        System.out.println("Principal: " + soma(matriz, true));
        System.out.println("Secundária: " + soma(matriz, false));
    }
}
