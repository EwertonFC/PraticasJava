package Exercicios4.Exercicios4_5;

public class LivroFisico implements Calculavel{

    private double valorProduto;

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public double calcularPrecoFinal(double valorProduto) {
        return valorProduto * 0.10 + valorProduto;
    }
}
