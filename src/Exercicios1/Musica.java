package Exercicios1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double avaliacao;



    void exibeFichaTecnica() {
        System.out.println("Nome da música: " + titulo + "\n" +
                "Nome do artista: " + artista + "\n" +
                "Ano do lançamento: " + anoLancamento + "\n" +
                "Avaliação: " + pegaMediaAvaliacoes() + "\n" +
                "Número de avaliações: " + numAvaliacoes + "\n");
    }

   void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
   }

   double pegaMediaAvaliacoes(){
        return  avaliacao / numAvaliacoes;
   }
}
