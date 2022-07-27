package L4.EX3;

public class UsaPonto3D {
    public static void main(String[] args) {
        Ponto3D pontoA = new Ponto3D(0d, 0d, 0d, "Vermelho", 0.5f);
        Ponto3D pontoB = new Ponto3D(0d, 0d, 1d, "Verde", 0.6f);
        Ponto3D pontoD = new Ponto3D(1d, 1d, 1d, "Azul", 0.7f);

        System.out.println("A" + pontoA.mostra() + " para B" + pontoB.mostra() + ": " + pontoA.calculaDistancia(pontoB));
        System.out.println("D" + pontoD.mostra() + " para A" + pontoA.mostra() + ": " + pontoD.calculaDistancia(pontoA));
    }
}