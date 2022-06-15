package L4.EX6;

public class Main{
    public static void main(String[] args){
        Ponto2D pontoA = new Ponto2D(0d, 0d);
        Ponto2D pontoB = new Ponto2D(1d, 0d);

        System.out.println(pontoA.calculaDistancia(pontoB));
    }
}