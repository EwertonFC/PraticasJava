import Exercicios4.Exercicios4_1.ConversorMoeda;
import Exercicios4.Exercicios4_2.CalculadoraSalaRetangular;
import Exercicios4.Exercicios4_3.TabuadaMultiplicacao;
import Exercicios4.Exercicios4_4.ConversorTemperaturaPadrao;

void main() {

    //Exercicio 4_1
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

    //Exercicio 4_2
//    CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
//    sala.setAltura(10);
//    sala.setBase(20);
//
//    System.out.println("Perímetro: " + sala.calcularPerimetro(sala.getBase(), sala.getAltura()) + " m");
//    System.out.println("Area: " + sala.calcularArea(sala.getBase(), sala.getAltura()) + " m²");

    //Exercicio 4_3
//    TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//    tabuada.setNumerox(2);
//
//    tabuada.mostrarTabuada(tabuada.getNumerox());

    //Exercicio 4_4
    ConversorTemperaturaPadrao conversao = new ConversorTemperaturaPadrao();
    conversao.setTemperatura(23);

    System.out.println("Temperatura: " + conversao.getTemperatura());
    System.out.println("Convertendo temperatura de C para F: " +
            conversao.celsiusParaFahrenheit(conversao.getTemperatura()) + " e F para C: " +
            conversao.fahrenheitParaCelsius(conversao.getTemperatura()));


}
