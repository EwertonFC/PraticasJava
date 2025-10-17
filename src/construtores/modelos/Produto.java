package construtores.modelos;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public Produto (String nome, double preco, double quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
