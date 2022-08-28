package L6.EX14;

public class Retangulo implements Figura {
    public Float base;
    public Float altura;

    public Retangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Float area() {
        return this.base * this.altura;
    }
}
