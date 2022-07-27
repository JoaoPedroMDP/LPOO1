package L3;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Integer numFuncionarios = 0;
        Double mediaSalarial = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionários:");
        numFuncionarios = Integer.parseInt(sc.nextLine());

        String[] nomeFuncionarios = new String[numFuncionarios];
        Double[] salarioFuncionarios = new Double[numFuncionarios];

        Integer i = 0;
        String bufferString = "";
        Double bufferDouble = 0d;
        do {
            try {
                System.out.println("Digite o nome do funcionário:");
                bufferString = sc.nextLine();
                if (bufferString.length() < 3) {
                    throw new Exception("Nome inválido");
                }
                nomeFuncionarios[i] = bufferString;
                System.out.println("Digite o salário do funcionário:");
                bufferDouble = Double.parseDouble(sc.nextLine());
                salarioFuncionarios[i] = bufferDouble;
                mediaSalarial += salarioFuncionarios[i];
                i++;
            } catch (Exception e) {
                System.out.println("Insira nome/salario novamente");
            }
        } while (i < numFuncionarios);

        mediaSalarial /= numFuncionarios;
        System.out.println("" + mediaSalarial);
        for (i = 0; i < numFuncionarios; i++) {
            if (salarioFuncionarios[i] > mediaSalarial) {
                System.out.println("O funcionário " + nomeFuncionarios[i] + " (R$ " + salarioFuncionarios[i]
                        + ") tem salário acima da média.");
            }
        }

    }
}