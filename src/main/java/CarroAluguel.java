public class CarroAluguel {
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean sinistro = false;
    private boolean disponibilidade;
    private float debito;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
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
        if(disponibilidade) 
            disponibilidade = false;
        
        else 
            throw new CarroIndisponivelException("O carro está indisponível.");  
    }
        
    public void devolver() {
        if(!disponibilidade) 
        disponibilidade = true;
        
        else
            throw new CarroDisponivelException("O carro está disponível.");
        
        if(debito > 0) 
            throw new CarroNaoPagoException("O carro não foi pago.");
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public boolean hasSinistro() {
        if(sinistro) return true;
        return false;
    }

    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }

    public float getDebito() {
        float valorASerPago = getValorPorKm() * getDistanciaPercorrida();
        if(sinistro == true) return (float) (valorASerPago * 1.6);
        return valorASerPago;
    }

    public void pagar() {
        if(isDisponivel())
            throw new CarroDisponivelException("O carro está disponível.");
        debito = 0;
    }
}
