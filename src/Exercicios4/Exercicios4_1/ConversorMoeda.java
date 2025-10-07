package Exercicios4.Exercicios4_1;

public class ConversorMoeda implements ConversaoFinanceira{

    private double valorDolar = 0;

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal(double valorDolar) {

        return valorDolar / 5.36;
    }
}
