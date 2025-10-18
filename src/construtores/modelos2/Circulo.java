package construtores.modelos2;

public class Circulo implements Forma{

    private double raio;
    private double pi = 3.1415;

    public Circulo(){

    }

    public Circulo(double raio, double pi){
        this.raio = raio;
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public double getPi() {
        return pi;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return getPi() * Math.pow(getRaio(), 2);
    }
}
