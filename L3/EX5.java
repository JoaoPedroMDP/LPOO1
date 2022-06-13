package L3;

import java.util.LinkedHashMap;

public class EX5 {

    static LinkedHashMap<Integer, String> conversoes = new LinkedHashMap<>(){{
        put(1, "um");
        put(2, "dois");
        put(3, "três");
        put(4, "quatro");
        put(5, "cinco");
        put(6, "seis");
        put(7, "sete");
        put(8, "oito");
        put(9, "nove");
        put(10, "dez");
        put(11, "onze");
        put(12, "doze");
        put(13, "treze");
        put(14, "quatorze");
        put(15, "quinze");
        put(16, "dezesseis");
        put(17, "dezessete");
        put(18, "dezoito");
        put(19, "dezenove");
        put(20, "vinte");
    }};

    static LinkedHashMap<Integer, String> conversoesDezenas = new LinkedHashMap<>(){{
        put(2, "vinte");
        put(3, "trinta");
        put(4, "quarenta");
    }};

    public static void main(String[] args) {
        Integer numero = Integer.parseInt(args[0]);

        if(numero < 0 || numero > 49){
            System.out.println("Número inválido");
            return;
        }

        Integer dezenas = numero / 10, unidades = numero % 10;

        if(numero < 20){
            System.out.println(conversoes.get(numero));
        }else{
            System.out.println(conversoesDezenas.get(dezenas) + " e " + conversoes.get(unidades));
        }
    }
}