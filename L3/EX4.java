package L3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Float aporteMensal = 0f, montanteDesejado = 0f, valorAtual = 0f;
        Scanner sc = new Scanner(System.in);
        Integer i = 0;

        System.out.println("Digite o valor do aporte mensal: ");
        aporteMensal = sc.nextFloat();
        System.out.println("Digite o valor desejado: ");
        montanteDesejado = sc.nextFloat();

        for(i = 0; valorAtual < montanteDesejado; i++){
            valorAtual += aporteMensal + 0.005f * valorAtual;
            System.out.println("Valor atual: " + valorAtual);
        }

        System.out.println("\nValor final: " + valorAtual + "\nMeses: " + i);
    }
}