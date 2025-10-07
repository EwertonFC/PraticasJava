package Exercicios4.Exercicios4_2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        return 2* (base * altura);
    }

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
}
