package Exercicios2;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {

        return nota3;
    }

    public double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3)/3;
    }

}