package L6.EX13;

import java.util.Scanner;

public abstract class Veiculo {
    public String dono;
    public String marca;

    public abstract void andar();

    public Veiculo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dono do veículo: ");
        this.dono = input.nextLine();
        System.out.println("Digite a marca do veículo: ");
        this.marca = input.nextLine();
    }

    public Veiculo(String dono, String marca) {
        this.dono = dono;
        this.marca = marca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}