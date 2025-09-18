package Exercicios1;

import java.time.LocalDate;

public class Carro {
    String modelo;
    String cor;
    int ano;
    int idadeCarro;

    int pegaIdadeCarro(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo + "\n" +
                "Cor do carro: " + cor + "\n" +
                "Ano do carro: " + ano + "\n" +
                "Idade do carro: " + pegaIdadeCarro()) ;
    }
}
