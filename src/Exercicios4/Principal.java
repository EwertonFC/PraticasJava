import Exercicios4.Exercicios4_1.ConversorMoeda;
import Exercicios4.Exercicios4_2.CalculadoraSalaRetangular;

void main() {

//    ConversorMoeda moeda = new ConversorMoeda();
//
//    moeda.setValorDolar(1);
//    double valorConvertido = moeda.converterDolarParaReal(moeda.getValorDolar());
//
//
//    System.out.println("Valor em dólar: " + moeda.getValorDolar() + "\n" +
//            "Valor em real: " + Math.round(valorConvertido * 100.0)/100.0);
//
//
    CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
    sala.setAltura(10);
    sala.setBase(20);

    System.out.println("Perímetro: " + sala.calcularPerimetro(sala.getBase(), sala.getAltura()) + " m");
    System.out.println("Area: " + sala.calcularArea(sala.getBase(), sala.getAltura()) + " m²");
}
