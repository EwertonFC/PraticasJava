package Exercicios2;

public class ContaBancaria {
    private double numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Saldo: " + getSaldo());
    }
}
