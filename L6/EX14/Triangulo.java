package L6.EX14;

public class Triangulo implements Figura {
    public Float base;
    public Float altura;

    public Triangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Float area() {
        return (this.base * this.altura) / 2;
    }
}
