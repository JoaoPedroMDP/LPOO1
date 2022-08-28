package L6.EX10;

public class C {
    protected String atributo1;
    protected Float atributo2;

    public C() {
        this.atributo1 = "VAZIO";
        this.atributo2 = -999.99f;
    }

    public C(String atributo1, Float atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public Float getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(Float atributo2) {
        this.atributo2 = atributo2;
    }
}
