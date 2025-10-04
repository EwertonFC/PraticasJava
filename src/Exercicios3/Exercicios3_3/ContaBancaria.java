package Exercicios3.Exercicios3_3;

public class ContaBancaria {
    private double saldo; // Saldo da conta, mantido privado para segurança

    // Getter e setter para acessar e alterar o saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Consultar conta
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + getSaldo());
    }

    // Depositar na conta
    public void depositar(double deposito){
        saldo += deposito;
    }

    // Sacar valor da conta
    public void sacar(double saque){
        saldo -= saque;
        System.out.println("Saldo atual: " + getSaldo());
    }
}
