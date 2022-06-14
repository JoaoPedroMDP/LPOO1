package L3;

import java.util.Scanner;

public class EX14 {
    private static void leituraStrings(String[] strings) {
        Scanner sc = new Scanner(System.in);
        for(Integer i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

        sc.close();
    }

    private static Integer buscaString(String[] strings, String string) throws Exception{
        Integer i = 0;
        for(i = 0; i < strings.length; i++) {
            if(strings[i].equals(string)) {
                return i;
            }
        }

        throw new Exception("String não encontrada");
    }

    public static void main(String[] args){
        String[] strings = new String[10];
        leituraStrings(strings);

        Scanner sc = new Scanner(System.in);
        String busca = sc.nextLine();
        sc.close();

        try{
            System.out.println("Posição: " + buscaString(strings, busca));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
