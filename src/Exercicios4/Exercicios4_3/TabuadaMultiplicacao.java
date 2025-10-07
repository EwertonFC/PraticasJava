package Exercicios4.Exercicios4_3;

public class TabuadaMultiplicacao implements Tabuada{

    private int numerox;

    public int getNumerox() {
        return numerox;
    }

    public void setNumerox(int numerox) {
        this.numerox = numerox;
    }

    @Override
    public void mostrarTabuada(int n) {
        System.out.println("1 x " + n + " = " + 1 * n);
        System.out.println("2 x " + n + " = " + 2 * n);
        System.out.println("3 x " + n + " = " + 3 * n);
        System.out.println("4 x " + n + " = " + 4 * n);
        System.out.println("5 x " + n + " = " + 5 * n);
        System.out.println("6 x " + n + " = " + 6 * n);
        System.out.println("7 x " + n + " = " + 7 * n);
        System.out.println("8 x " + n + " = " + 8 * n);
        System.out.println("9 x " + n + " = " + 9 * n);
        System.out.println("10 x " + n + " = " + 10 * n);
    }
}
