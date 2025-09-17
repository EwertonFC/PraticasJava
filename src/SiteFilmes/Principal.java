package SiteFilmes;

public class Principal {
    public static void main (String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Harry Potter";
        filme1.anoDeLancamento = 2001;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 130;


        filme1.avalia(10);
        filme1.avalia(8);

        filme1.exibeFichaTecnica();
        filme1.pegaMedia();
    }
}
