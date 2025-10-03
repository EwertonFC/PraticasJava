package Exercicios3.Exercicios3_2;

public class Animal {
    private String nome;
    private double peso;
    private String raca;


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
