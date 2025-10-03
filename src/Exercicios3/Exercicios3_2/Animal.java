package Exercicios3.Exercicios3_2;

public class Animal {
    String nome;
    double peso;
    String raca;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom(){
        System.out.println("fazer barulho");
    }

}
