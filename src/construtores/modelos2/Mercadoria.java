package construtores.modelos2;

public class Mercadoria {

    private String nome;
    private double preco;
    private double precoTotal = 0;

    public Mercadoria(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
