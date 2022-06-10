package L2;

public class EX13 {
    private static int fib(Integer limite){
        int fib = 0, anterior = 1, anteanterior = 0;
        System.out.println("0");
        if (limite == 0) {
            return 0;
        }
        System.out.println("1");
        if (limite == 1) {
            return 0;
        }

        while (true) {
            fib = anteanterior + anterior;
            anteanterior = anterior;
            anterior = fib;
            if(fib > limite){
                break;
            }
            System.out.println(fib);
        }
        return 0;

    }
    public static void main(String[] args) {
        int limite = Integer.parseInt(args[0]);
        fib(limite);
    }
}