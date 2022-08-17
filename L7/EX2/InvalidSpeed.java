

public class InvalidSpeed extends Exception {
    public InvalidSpeed(int velocidade){
        super(velocidade + " não está dentro dos limites estabelecidos (0 <= velocidade < 100)");
    }
}
