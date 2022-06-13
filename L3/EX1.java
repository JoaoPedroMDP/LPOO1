package L3;

import java.util.Collection;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EX1 {
    private static List<Float> pegaValores(){
        Float parsed = 0f;
        Boolean continua = true;
        List<Float> numeros = new ArrayList<Float>();
        String buffer;
        Scanner sc = new Scanner(System.in);

        do{
            buffer = sc.nextLine();
            if(buffer.equals("S")){
                continua = false;
            }else{
                try{
                    parsed = Float.parseFloat(buffer);
                    numeros.add(parsed);
                }catch(NumberFormatException e){
                    System.out.println("Valor inválido, insira novamente");
                }
            }
        }while(continua);

        return numeros;
    }

    public static void main(String args[]) {
        List<Float> numeros = pegaValores();
        Float media = 0f;
        for (Float numero : numeros) {
            media += numero;
        }

        media = media/numeros.size();
        System.out.println("Média: " + media);
    }
}
