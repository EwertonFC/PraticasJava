package SiteFilmes;

public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("O nome do filme é: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento + "\n" +
                "A duração em minutos é: " + duracaoEmMinutos);
        if (incluidoNoPlano) {
            System.out.println("É incluso no plano");
        } else {
            System.out.println("Não é incluso no plano");
        }
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    void avalia ( double nota ){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia () {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
