package Exercicios3.Exercicios3_2;

public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();


        //herança e polimorfismo
        gato.emitirSom();
        cachorro.emitirSom();
    }
}
