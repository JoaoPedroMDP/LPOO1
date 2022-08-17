class Bicicleta {
    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;
    int rpm;

    public Bicicleta(int cadencia, int velocidade, int marcha, int rpm) throws InvalidSpeed, InvalidMarch, InvalidRpm {
        this.cadencia = cadencia;
        this.setVelocidade(velocidade);
        this.setMarcha(marcha);
        this.setRpm(rpm);
    }

    void mudarCadencia(int novoValor) {
        cadencia = novoValor;
    }

    void mudarMarcha(int novoValor) {
        marcha = novoValor;
    }

    void aumentarVelocidade(int incremento) {
        velocidade = velocidade + incremento;
    }

    void aplicarFreios(int decremento) {
        velocidade = velocidade - decremento;
    }

    void printStates() {
        System.out.println("cadencia=" + cadencia + " velocidade=" + velocidade + "marcha=" + marcha);
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) throws InvalidSpeed {
        if (velocidade < 0 || velocidade > 100) {
            throw new InvalidSpeed(velocidade);
        }

        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) throws InvalidMarch {
        if (marcha < 0 || marcha > 24) {
            throw new InvalidMarch(marcha);
        }
        this.marcha = marcha;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) throws InvalidRpm {
        if (rpm < 0) {
            throw new InvalidRpm(rpm);
        }
        this.rpm = rpm;
    }

}
