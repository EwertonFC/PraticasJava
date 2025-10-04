package Exercicios3.Exercicios3_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaCorrente extends ContaBancaria{
    LocalDate hoje = LocalDate.now();       // Data atual para cálculos
    LocalDate dataUltimaTarifa;             // Última data em que a tarifa foi cobrada
    int taxaFixa = 2;                        // Valor fixo da tarifa mensal

    // Setter e getter da data da última tarifa
    public void setDataUltimaTarifa(LocalDate dataUltimaTarifa) {
        this.dataUltimaTarifa = dataUltimaTarifa;
    }

    public LocalDate getDataUltimaTarifa() {
        return dataUltimaTarifa;
    }

    // Método para cobrar tarifa mensal
    public void cobrarTarifaMensal() {
        // Calcula a quantidade de dias desde a última tarifa
        double quantidadeDias = ChronoUnit.DAYS.between(getDataUltimaTarifa(), hoje);

        // Se passou 30 dias ou mais, cobra a tarifa
        if (quantidadeDias >= 30) {
            double quantidadeMesesCobrados = quantidadeDias / 30; // Calcula quantos meses se passaram
            double taxaCobrada = quantidadeMesesCobrados * taxaFixa; // Valor total da tarifa
            System.out.println("A taxa que deve ser cobrada é: " + taxaCobrada);

            double novoSaldo = getSaldo() - taxaCobrada;
            setSaldo(novoSaldo);             // Atualiza o saldo da conta
            setDataUltimaTarifa(hoje);       // Atualiza a data da última cobrança
        }
    }
}
