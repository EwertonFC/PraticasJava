package Exercicios2;

public class Principal {
    public static void main(String[] args) {

        // class ContaBancaria
        /*
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setSaldo(800);
        contaBancaria1.exibirInformacoes();
         */

        // class IdadePessoa
        /*
        IdadePessoa idadePessoa1 = new IdadePessoa();
        idadePessoa1.setIdade(29);
        idadePessoa1.setNome("Carlos");
        IdadePessoa idadePessoa2 = new IdadePessoa();
        idadePessoa2.setIdade(17);
        idadePessoa2.setNome("Fernanda");

        idadePessoa1.verificarIdade(idadePessoa1.getIdade());
        idadePessoa2.verificarIdade(idadePessoa2.getIdade());
        */

        // class Produto
        /*
        Produto produto1 = new Produto();
        produto1.setNome("Air Force");
        produto1.setPreco(750);

        System.out.println("Produto sem desconto: " + produto1.getPreco());
        System.out.println("Produto com desconto: " + produto1.aplicaDesconto());
        */

        // class Aluno
        /*
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ewerton");
        aluno1.setNota1(7);
        aluno1.setNota2(8);
        aluno1.setNota3(10);
        double media = aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2(), aluno1.getNota3());
        System.out.println(
                "A média de " + aluno1.getNome() + " é: " + media
        );
        */

        // class Livro
        Livro livro1 = new Livro();
        livro1.setAutor("Ewerton");
        livro1.setTitulo("Cidade das Sombras");
        livro1.exibirDetalhes(livro1.getAutor(), livro1.getTitulo());

    }
}

