package Exercicios3.Exercicios3_4;

public class Principal {

    public static void main(String[] args) {

        // objetos
        GeradorPrimo gerador = new GeradorPrimo();
        VerificadorPrimo verificador = new VerificadorPrimo();

        // verificar se é primo
        if (verificador.verificarSeEhPrimo(9)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        // gerar o próximo primo
        System.out.println("O próximo primo é: " + gerador.gerarProximoPrimo(13));
    }
}
