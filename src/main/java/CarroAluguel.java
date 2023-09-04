public class CarroAluguel {
    private float valorPorKm;
    private float distanciaPercorrida;
    private String estadoDoCarro;

    public CarroAluguel(float valorPorKm/* , float distanciaPercorrida, String estadoDoCarro */) {
        this.valorPorKm = valorPorKm;
        /* this.distanciaPercorrida = distanciaPercorrida;
        this.estadoDoCarro = estadoDoCarro; */
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setDistanciaPercorrida(float distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void alugar() {
        
    }
}
