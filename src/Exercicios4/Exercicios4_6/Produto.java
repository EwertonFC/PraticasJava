package Exercicios4.Exercicios4_6;

public class Produto implements Vendavel{
    double quantidadeProduto;
    double precoUnitarioProduto;

    public double getPrecoUnitarioProduto() {
        return precoUnitarioProduto;
    }

    public double getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(double quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public double calcularPrecoFinal() {

        if (quantidadeProduto == 0){
            return 0;
        } else if (quantidadeProduto >= 1 && quantidadeProduto < 10) {
            precoUnitarioProduto = 10;
            return precoUnitarioProduto * quantidadeProduto;
            // Quantidade a cima de 10 tem desconto de 20% no preço unitário.
        } else {
            precoUnitarioProduto = 8;
            return precoUnitarioProduto * quantidadeProduto;
        }
    }
}
