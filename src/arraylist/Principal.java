package arraylist;

import arraylist.modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Ewerton");
        pessoa1.setIdade(24);

        pessoa2.setNome("Dani");
        pessoa2.setIdade(25);

        pessoa3.setNome("Marinez");
        pessoa3.setIdade(49);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);

    }

}