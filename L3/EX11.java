package L3;

import java.util.Scanner;

public class EX11{
    
    // Sarrus
    private static Float determinante(Float[][] matriz){
        Float principal = 
            matriz[0][0] * matriz[1][1] * matriz[2][2] +
            matriz[0][1] * matriz[1][2] * matriz[2][0] +
            matriz[0][2] * matriz[1][0] * matriz[2][1];

        Float secundario = 
            matriz[2][0] * matriz[1][1] * matriz[0][2] +
            matriz[2][1] * matriz[1][2] * matriz[0][0] +
            matriz[2][2] * matriz[1][0] * matriz[0][1];

        return principal - secundario;
    }

    public static void main(String[] args){
        // Determinante matriz 3x3
        Float[][] matriz = new Float[3][3];

        // Pega matriz do input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextFloat();
            }
        }
        sc.close();

        Float det = determinante(matriz);
        System.out.println("Determinante: " + det);
    }
}