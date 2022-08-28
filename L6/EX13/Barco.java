package L6.EX13;

import java.util.Scanner;

public class Barco extends VeiculoAquatico {
    public Integer peixesAtropelados;

    public Barco() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de peixes atropelados: ");
        this.peixesAtropelados = input.nextInt();
    }

    public void andar() {
        System.out.println("Barco navegando, " + this.dono + " já atropelou " + this.peixesAtropelados + " peixes");
    }
}
