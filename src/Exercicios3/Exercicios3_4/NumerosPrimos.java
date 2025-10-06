package Exercicios3.Exercicios3_4;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public int gerarProximoPrimo(int n) {
        int proximo = n + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
