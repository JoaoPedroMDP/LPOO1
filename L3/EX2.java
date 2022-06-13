package L3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EX2 {
    private static List<Float> pegaValores(Integer limite){
        Float parsed = 0f;
        List<Float> numeros = new ArrayList<Float>();
        String buffer;
        Scanner sc = new Scanner(System.in);

        do{
            buffer = sc.nextLine();
            try{
                parsed = Float.parseFloat(buffer);
                numeros.add(parsed);
                limite--;
            }catch(NumberFormatException e){
                System.out.println("Valor inválido, insira novamente: ");
            }
        }while(limite > 0);

        return numeros;
    }

    public static void main(String[] args) {
        List<Float> numeros = pegaValores(3);
        Float soma = 0f;

        for (Float num : numeros){
            if(num %2 == 0){
                soma += num;
            }
        }

        System.out.println("Soma: " + soma);
    }
}