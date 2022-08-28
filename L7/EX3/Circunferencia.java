package L7.EX3;

public class Circunferencia implements Superficie {
    private Double raio;

    public Circunferencia(Double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio invalido");
        }
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