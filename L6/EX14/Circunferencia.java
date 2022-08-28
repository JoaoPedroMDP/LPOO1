package L6.EX14;

public class Circunferencia implements Figura {
    public Float raio;

    public Circunferencia(Float raio) {
        this.raio = raio;
    }

    @Override
    public Float area() {
        return (float) (Math.PI * Math.pow(this.raio, 2));
    }
}