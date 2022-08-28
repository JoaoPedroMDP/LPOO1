package L6.EX11;

public class Quadrado implements Superficie {
    public Double lado;

    public Quadrado(Double lado) {
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
