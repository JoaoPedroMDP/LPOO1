package L2;

public class EX9 {
    // Programa que faz bhaskara
    private static float delta(float a, float b, float c) {
        return (float) Math.pow(b, 2) - 4 * a * c;
    }

    private static float calcula(float a, float b, float c, float delta, int sinal) {
        return (float) ((-b + (sinal * Math.sqrt(delta))) / (2 * a));
    }

    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]), b = Float.parseFloat(args[1]), c = Float.parseFloat(args[2]);
        float delta = delta(a, b, c);

        float x1 = calcula(a, b, c, delta, 1), x2 = calcula(a, b, c, delta, -1);
        System.out.printf("%.2f\n", x1);
        System.out.printf("%.2f\n", x2);
    }
}
