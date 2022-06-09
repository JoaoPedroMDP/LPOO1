package L2;

public class EX7 {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]), s = Integer.parseInt(args[1]), t = Integer.parseInt(args[2]), maior = r;

        if (r == s || s == t || r == t) {
            System.out.println("Favor inserir valores diferentes");
        }
        maior = r;

        if (s > maior) {
            maior = s;
        }

        if (t > maior) {
            maior = t;
        }

        System.out.println("Maior: " + maior);
    }
}
