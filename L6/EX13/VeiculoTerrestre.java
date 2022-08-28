package L6.EX13;

import java.util.Scanner;

public abstract class VeiculoTerrestre extends Veiculo {
    public Integer numerodeRodas;

    public VeiculoTerrestre() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de rodas do veículo: ");
        this.numerodeRodas = input.nextInt();

    }

    public VeiculoTerrestre(String dono, String marca, Integer numeroDeRodas) {
        super(dono, marca);
        this.numerodeRodas = numeroDeRodas;
    }

}
