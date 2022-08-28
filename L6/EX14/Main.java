package L6.EX14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>() {
            {
                add(new Triangulo(2.0f, 2.0f));
                add(new Circunferencia(2.0f));
                add(new Retangulo(2.0f, 2.0f));
                add(new Triangulo(2.0f, 2.0f));
                add(new Retangulo(2.0f, 2.0f));
                add(new Circunferencia(2.0f));
                add(new Retangulo(2.0f, 2.0f));
                add(new Circunferencia(2.0f));
                add(new Triangulo(2.0f, 2.0f));
            }
        };

        Float areaTotal = 0f;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
        }

        System.out.println("Área total: " + areaTotal);
    }
}
