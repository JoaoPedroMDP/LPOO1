package L6.EX11;

public class Main {
    public static void main(String[] args){
        Superficie quad = new Quadrado(10.0);
        System.out.println(quad.area());

        Superficie circ = new Circunferencia(10.0);
        System.out.println(circ.area());
    }
}
