package L4.EX6;

public class Ponto2D{
    private Double x;
    private Double y;

    public Ponto2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double calculaDistancia(Ponto2D p){
        return Math.sqrt(
            Math.pow(p.x - this.x, 2)+
            Math.pow(p.y - this.y, 2)
        );
    }

    public Double getX() {
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
}