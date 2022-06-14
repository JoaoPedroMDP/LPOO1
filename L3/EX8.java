package L3;

import java.util.Scanner;

public class EX8{
    private static Float processaValores(){
        Float soma = 0f;
        Integer parsed = 0, quantidade = 0;
        Boolean continua = true;
        String buffer;
        Scanner sc = new Scanner(System.in);

        do{
            buffer = sc.nextLine();
            if(buffer.equals("FIM")){
                continua = false;
            }else{
                try{
                    parsed = Integer.parseInt(buffer);
                    soma += parsed;
                    quantidade++;
                }catch(NumberFormatException e){
                    System.out.println("Valor inválido, insira novamente");
                }
            }
        }while(continua);
        sc.close();

        return soma / quantidade;
    }
    
    public static void main(String[] args){
        Float media = processaValores();
        System.out.println("Média: " + media);

    }
}