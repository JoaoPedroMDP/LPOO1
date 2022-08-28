package L7.EX3;

public class Quadrado implements Superficie {
    public Double lado;

    public Quadrado(Double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado invalido");
        }
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getPerimetro() {
        return lado * 4;
    }

    @Override
    public Double area() {
        return lado * lado;
    }
}
