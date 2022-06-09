package L2;

public class EX4 {
    public static void main(String[] args) {
        float dist = Float.parseFloat(args[0]), tempo = Float.parseFloat(args[1]);
        float vel = dist / tempo;

        System.out.printf("Velocidade média: %.2f\n", vel);
    }
}
