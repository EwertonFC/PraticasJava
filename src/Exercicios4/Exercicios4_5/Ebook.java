package Exercicios4.Exercicios4_5;

public class Ebook implements Calculavel{

    private double valorProduto;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public double calcularPrecoFinal(double valorProduto) {
        return valorProduto - (valorProduto * 0.20);
    }
}
