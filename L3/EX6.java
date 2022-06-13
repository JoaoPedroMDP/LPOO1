package L3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class EX6 {
    static LinkedHashMap<Integer, String> dias = new LinkedHashMap<>(){{
        put(1, "domingo");
        put(2, "segunda");
        put(3, "terça");
        put(4, "quarta");
        put(5, "quinta");
        put(6, "sexta");
        put(7, "sábado");
    }};

    public static void main(String[] args) {
        Float maior = Float.MIN_VALUE, menor = Float.MAX_VALUE, media = 0f, buffer = 0f;
        Integer diaSemanaMaior = 0, diaSemanaMenor = 0;
        Scanner sc = new Scanner(System.in);

        for(Integer i = 0; i < 7; i++){
            buffer = Float.parseFloat(sc.nextLine());

            if(buffer > maior){
                maior = buffer;
                diaSemanaMaior = i+1;
            }

            if(buffer < menor){
                menor = buffer;
                diaSemanaMenor = i+1;
            }

            media += buffer;
        }

        System.out.println("Maior temperatura: " + maior + " (" + dias.get(diaSemanaMaior) + ")");
        System.out.println("Menor temperatura: " + menor + " (" + dias.get(diaSemanaMenor) + ")");
        System.out.println("Temperatura média: " + media / 7);
    }
}