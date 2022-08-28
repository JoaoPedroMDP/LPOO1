package L6.EX10;

public class C1_2 extends C implements I1, I2 {
    private Float[][] atributo3;

    public C1_2() {
        super();
        this.atributo3 = this.initMatrix(0f, 2);
    }

    public C1_2(Float[][] atributo3) {
        this.atributo3 = this.initMatrix(1f, 3);
    }

    public C1_2(String atributo1, Float atributo2) {
        super(atributo1, atributo2);
        this.atributo3 = this.initMatrix(1f, 3);
    }

    public C1_2(String atributo1, Float atributo2, Float[][] atributo3) {
        super(atributo1, atributo2);
        this.atributo3 = this.initMatrix(1f, 3);
    }

    public Float[][] initMatrix(Float placeholder, Integer size) {
        Float[][] atributo3buffer = new Float[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                atributo3buffer[i][j] = placeholder;
            }
        }

        return atributo3buffer;
    }

    @Override
    public void operacao1() {
        System.out.println("Passando por operacao 1!");
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        this.printMatrix();
    }

    private void printMatrix() {
        for (int i = 0; i < this.atributo3.length; i++) {
            for (int j = 0; j < this.atributo3[0].length; j++) {
                System.out.print(atributo3[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void operacao2() {
        System.out.println("Passando por operacao 2!");
    }

    public Float[][] getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(Float[][] atributo3) {
        this.atributo3 = atributo3;
    }

}
