public class Circulo {
    public float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        return (float) (3.14159 * Math.pow(raio, 2));
    }

    public float getCircunferencia() {
        return (float) (2 * 3.14159 * raio);
    }
}
