package L2;

public class EX5 {

    /**
     * @author João Pedro Martins de Paula
     * @version 1.0
     * @param args argumentos
     */
    public static void main(String[] args) {
        int quantidadeDvds = Integer.parseInt(args[0]);
        float precoAluguel = Float.parseFloat(args[1]);
        float alugueisPorMes = 0.3f;
        float precoMulta = 0.1f;
        float multasPorMes = 0.1f;
        float rentabilidadeMensal = quantidadeDvds * precoAluguel * alugueisPorMes;
        System.out.printf("Rentabilidade mensal: R$ %.2f\n", rentabilidadeMensal);
        System.out.printf("Rentabilidade anual: R$ %.2f\n", rentabilidadeMensal * 12);
        /*
         * O ganho com multas é dado pela quantidade de empréstimos atrasados * preço da
         * multa. A quantidade de empréstimos atrasados é de 10%, de acordo com o
         * enunciado.
         * Para tanto, é necessário multiplicar a porcentagem de atrasos pela quantidade
         * de empréstimos
         */
        System.out.printf("Ganho com multas:  R$ %.2f\n",
                precoAluguel * alugueisPorMes * multasPorMes * precoMulta);
    }
}
