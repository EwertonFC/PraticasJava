package construtores;

import construtores.modelos.Produto;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {

        Produto produto1 = new Produto("sapato", 500, 10);
        Produto produto2 = new Produto("calça", 120, 20);
        Produto produto3  = new Produto("camisa", 80, 15);

        ArrayList<Produto> listaObjetos = new ArrayList<>();

        listaObjetos.add(produto1);
        listaObjetos.add(produto2);
        listaObjetos.add(produto3);

        System.out.println(listaObjetos.size());
        System.out.println(listaObjetos.get(2));

    }
}
