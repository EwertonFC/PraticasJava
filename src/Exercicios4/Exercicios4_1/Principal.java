import Exercicios4.Exercicios4_1.ConversorMoeda;

void main() {

    ConversorMoeda moeda = new ConversorMoeda();

    moeda.setValorDolar(1);
    double valorConvertido = moeda.converterDolarParaReal(moeda.getValorDolar());


    System.out.println("Valor em dólar: " + moeda.getValorDolar() + "\n" +
            "Valor em real: " + Math.round(valorConvertido * 100.0)/100.0);
}