package L3;

public class EX10 {
    public static void main(String[] args){
        Integer[][][] matriz = new Integer[5][10][3];

        for(Integer i = 0; i < 5; i++){
            for(Integer j = 0; j < 10; j++){
                for(Integer k = 0; k < 3; k++){
                    matriz[i][j][k] = i + j + k;
                    System.out.println("[" + i + "][" + j + "][" + k + "] = " + matriz[i][j][k]);
                }
            }
        }
    }
}