package Exercicios4.Exercicios4_4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public double celsiusParaFahrenheit(double temperatura) {
        return temperatura * 9/5 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura) {
        return (temperatura - 32) * 5/9;
    }
}
