package construtores.modelos2;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria (int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
