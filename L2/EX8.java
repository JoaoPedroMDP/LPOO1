package L2;

public class EX8 {
    public static void main(String args[]) {
        float x1 = Float.parseFloat(args[0]), y1 = Float.parseFloat(args[1]), x2 = Float.parseFloat(args[2]),
                y2 = Float.parseFloat(args[3]);
        System.out.printf("%.2f\n", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
