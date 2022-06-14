package L3;

import java.util.Scanner;

public class EX9{
    public static void main(String[] args){
        String frase = (new Scanner(System.in)).nextLine().toLowerCase().replaceAll("[^a-z]", "");

        String[] letras = frase.split("");
        Integer tamanho = letras.length;
        for(Integer i = 0; i < tamanho/2 + 1; i++){
            if(!letras[i].equals(letras[tamanho - i - 1])){
                System.out.println("Não é palíndromo");
                return;
            }
        }

        System.out.println("É palíndromo");
    }
}