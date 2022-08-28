package L7.EX2;

public class InvalidRpm extends Exception {
    public InvalidRpm(int rpm) {
        super(rpm + " não obedece aos limites estabelecidos ( > 0)");
    }
}
