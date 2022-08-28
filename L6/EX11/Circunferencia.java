package L6.EX11;

public class Circunferencia implements Superficie {
    private Double raio;

    public Circunferencia(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double area() {
        return Math.PI * raio * raio;
    }
}