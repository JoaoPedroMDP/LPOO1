package L6.EX13;

import java.util.Scanner;

public abstract class VeiculoAereo extends Veiculo {
    public Float altitude;

    public VeiculoAereo() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altitude do veículo: ");
        this.altitude = input.nextFloat();

    }

    public VeiculoAereo(String dono, String marca, Float altitude) {
        super(dono, marca);
        this.altitude = altitude;
    }

}
