package Exercicios3.Exercicios3_3;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Criando uma conta genérica e uma conta corrente
        ContaBancaria conta = new ContaBancaria();
        ContaCorrente cc = new ContaCorrente();

        // Testes com a conta corrente
        cc.consultarSaldo(); // Mostra saldo inicial (0)
        cc.depositar(100);   // Deposita 100 na conta
        cc.consultarSaldo(); // Mostra saldo atualizado

        // Configura a data da última tarifa para 10/08/2025
        cc.setDataUltimaTarifa(LocalDate.of(2025, 8, 10));
        System.out.println(cc.dataUltimaTarifa); // Apenas para conferência

        // Cobra a tarifa mensal, caso já tenha passado 30 dias
        cc.cobrarTarifaMensal();

        // Consulta saldo novamente para ver se a tarifa foi descontada
        cc.consultarSaldo();
    }
}
