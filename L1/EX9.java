package L1;

public class EX9 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(args[0]), num2 = Float.parseFloat(args[1]), result = 0;
        String operacao = args[2];

        switch (operacao) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "X":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
    }
}