package construtores;

import construtores.modelos.*;

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

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Leite", 10, 5, "20/10/2026");
        System.out.println(produtoPerecivel1);

        Nome nome1 = new Nome("Ewerton");
        Nome nome2 = new Nome("Emerson");
        Nome nome3 = new Nome("Danni");

        ArrayList<Nome> nomes = new ArrayList<>();
        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);

        for (Nome item: nomes){
            System.out.println(item);
        }


        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.setNome("sem nome");
        animal2.setNome("sem nome");


        Cachorro cachorro = new Cachorro();
        cachorro.setRaca("pastor alemão");
        cachorro.setNome("Luther");

        ArrayList<Animal> animal = new ArrayList<>();

        animal.add(animal1);
        animal.add(animal2);
        animal.add(cachorro);


        for (Animal item : animal){
            if (item instanceof Cachorro){
                Cachorro casting = (Cachorro) item;
                System.out.println(casting.getRaca());
            }

        }
    }
}
