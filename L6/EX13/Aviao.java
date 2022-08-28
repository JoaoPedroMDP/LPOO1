package L6.EX13;

import java.util.Scanner;

public class Aviao extends VeiculoAereo {
    public Integer passageiros;

    public Aviao() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de passageiros do avião: ");
        this.passageiros = input.nextInt();
    }

    public void andar() {
        System.out.println("Aviao de " + this.dono + " voando, carregando " + this.passageiros + " passageiros");
    }
}
