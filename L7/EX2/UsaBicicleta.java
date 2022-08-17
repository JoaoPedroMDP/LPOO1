public class UsaBicicleta {
    public static void main(String[] args) {
        try {
            Bicicleta novaBike = new Bicicleta(2, -1, 3, 5);
            novaBike.setMarcha(25);
        } catch (InvalidSpeed e) {
            System.out.println(e.getMessage());
        } catch (InvalidMarch e) {
            System.out.println(e.getMessage());
        } catch (InvalidRpm e) {
            System.out.println(e.getMessage());
        }
    }
}
