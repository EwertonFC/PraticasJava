package Exercicios4.Exercicios4_6;

public class Servico implements Vendavel{

    private double quantidadeHorasServico;
    private double precoHoraServico;

    public double getPrecoHoraServico() {
        return precoHoraServico;
    }

    public void setPrecoHoraServico(double precoHoraServico) {
        this.precoHoraServico = precoHoraServico;
    }

    public double getQuantidadeHorasServico() {
        return quantidadeHorasServico;
    }

    public void setQuantidadeHorasServico(double quantidadeHorasServico) {
        this.quantidadeHorasServico = quantidadeHorasServico;
    }

    @Override
    public double calcularPrecoFinal() {

        if (quantidadeHorasServico == 0){
            return 0;
        } else if (quantidadeHorasServico >= 1 && quantidadeHorasServico < 10) {
            return precoHoraServico * quantidadeHorasServico;
        //A cima de 8 tem acréscimo de 20% no valor da hora.
        } else {
            return (precoHoraServico * 0.20 + precoHoraServico) * quantidadeHorasServico;
        }
    }
}
