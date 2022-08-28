package L7.EX3;

public class Main {
    public static void main(String[] args) {
        try {
            Superficie quad = new Quadrado(0.0);
            System.out.println(quad.area());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Superficie circ = new Circunferencia(-10.0);
            System.out.println(circ.area());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
