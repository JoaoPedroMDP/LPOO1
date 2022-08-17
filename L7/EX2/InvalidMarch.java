

public class InvalidMarch extends Exception {
    public InvalidMarch(int march) {
        super(march + " não está dentro dos limites estabelecidos (0 <= marcha <= 24)");
    }
}
