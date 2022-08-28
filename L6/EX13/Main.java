package L6.EX13;

import java.util.Scanner;

public class Main {
    private static void menu() {
        System.out.println("Escolha qual veículo deseja criar: ");
        System.out.println("1 - Carro");
        System.out.println("2 - Aviao");
        System.out.println("3 - Trem");
        System.out.println("4 - Barco");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {
        Veiculo veiculo = null;
        Main.menu();
        Scanner input = new Scanner(System.in);
        int opcao = Integer.parseInt(input.nextLine());

        switch (opcao) {
            case 1:
                veiculo = new Carro();
                break;
            case 2:
                veiculo = new Aviao();
                break;
            case 3:
                veiculo = new Trem();
                break;
            case 4:
                veiculo = new Barco();
                break;
            case 0:
                System.out.println("Saindo...");
                System.exit(0);
                break;
        }

        System.out.println("Veículo criado com sucesso");
        veiculo.andar();

    }
}
