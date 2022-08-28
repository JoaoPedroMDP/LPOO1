package L6.EX13;

import java.util.Scanner;

public abstract class VeiculoAquatico extends Veiculo {
    public Float profundidade;

    public VeiculoAquatico() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a profundidade do veículo: ");
        this.profundidade = input.nextFloat();

    }

    public VeiculoAquatico(String dono, String marca, Float profundidade) {
        super(dono, marca);
        this.profundidade = profundidade;
    }

}
