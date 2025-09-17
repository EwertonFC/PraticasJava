package Exercicios1;

public class Principal {
    public static void main(String[] args) {

        /*
        //tarefa 1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.pessoaCumprimentar();

        //tarefa 2
        Calculadora calculo1 = new Calculadora();
        calculo1.retornaDobro(4);
        */

        //tarefa 3
        Musica musica1 = new Musica();
        musica1.titulo = "Deixa Acontecer";
        musica1.artista = "Revelação";
        musica1.anoLancamento = 2001;

        musica1.avaliaMusica(8);
        musica1.avaliaMusica(9);
        musica1.pegaMediaAvaliacoes();
        musica1.exibeFichaTecnica();
    }

}
