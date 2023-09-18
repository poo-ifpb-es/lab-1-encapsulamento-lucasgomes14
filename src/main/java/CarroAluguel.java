public class CarroAluguel {
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean sinistro;
    private boolean disponibilidade;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        distanciaPercorrida = 0;
        sinistro = false;
        disponibilidade = true;
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

    public void alugar() throws CarroIndisponivelException {
        if(isDisponivel()) 
            disponibilidade = false;
        
        else 
            throw new CarroIndisponivelException("O carro está indisponível.");  
    }
        
    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if(isDisponivel()) 
            throw new CarroDisponivelException("O carro está disponível.");
        
        if(getDebito() > 0) 
            throw new CarroNaoPagoException("O carro não foi pago.");

        disponibilidade = true;
        sinistro = false;
        distanciaPercorrida = 0;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public boolean hasSinistro() {
        return sinistro;
    }

    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }

    public float getDebito() {
        float valorASerPago = getValorPorKm() * getDistanciaPercorrida();

        if(hasSinistro()) {
            sinistro = false;
            return (float) (valorASerPago * 1.6);
        }

        return valorASerPago;
    }

    public void pagar() throws CarroDisponivelException {
        if(isDisponivel())
            throw new CarroDisponivelException("O carro está disponível.");

        distanciaPercorrida = 0;
    }
}
