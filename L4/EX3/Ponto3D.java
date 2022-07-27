package L4.EX3;

public class Ponto3D {
    private Double x;
    private Double y;
    private Double z;
    private String cor;
    private Float intensidade;

    public Ponto3D(Double x, Double y, Double z, String cor, Float intensidade) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    protected Double calculaDistancia(Ponto3D p) {
        return Math.sqrt(
                Math.pow(p.x - this.x, 2) +
                        Math.pow(p.y - this.y, 2) +
                        Math.pow(p.z - this.z, 2));
    }

    protected Double getX() {
        return this.x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return this.z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getIntensidade() {
        return this.intensidade;
    }

    public void setIntensidade(Float intensidade) {
        this.intensidade = intensidade;
    }

    public String mostra() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}