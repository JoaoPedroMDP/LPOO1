package L2;

public class EX10 {
    public static void main(String[] args) {
        float atual = Float.parseFloat(args[0]), meta = Float.parseFloat(args[1]);

        System.out.printf("Sera necessario perder %.1f%% do seu peso atual\n", ((atual - meta) / atual) * 100);
    }
}
