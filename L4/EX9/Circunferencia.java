package L4.EX9;

public class Circunferencia {
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
    
    public Double getArea() {
        return Math.PI * raio * raio;
    }
}