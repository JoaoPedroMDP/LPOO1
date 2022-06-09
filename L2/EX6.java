package L2;

public class EX6 {
    public static void main(String[] args) {
        int inteiro = Integer.parseInt(args[0]);
        float real = Float.parseFloat(args[1]);

        float soma = ((float) inteiro) + real;

        System.out.printf("Soma: %.3f\n", soma);
    }
}
