package L6.EX13;

import java.util.Scanner;

public class Carro extends VeiculoTerrestre {
    public String placa;

    public Carro() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a placa do carro: ");
        this.placa = input.nextLine();

    }

    public void andar() {
        System.out.println("Carro " + this.placa + ", de " + this.dono + ", andando");
    }
}
