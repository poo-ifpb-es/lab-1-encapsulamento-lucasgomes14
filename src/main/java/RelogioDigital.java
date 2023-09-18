public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital() {
        hora = 12;
        minuto = 20;
    }

    public void setHora(int hora) {
        if(hora < 24 && hora >= 0) {
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 24) {
            this.minuto = minuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void tick() {
        if(this.minuto == 59) {
            if(this.hora == 23){
                this.hora = 0;
                this.minuto = 0;
            } else {
                this.hora += 1;
                this.minuto = 0;
            }
        } else {
            this.minuto += 1;
        }

    }


}

