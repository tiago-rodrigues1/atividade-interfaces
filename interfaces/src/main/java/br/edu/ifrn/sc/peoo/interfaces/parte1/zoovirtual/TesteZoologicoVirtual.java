/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte1.zoovirtual;

public class TesteZoologicoVirtual {

    public static void cicloDeVida(Animal animal) {
        animal.nasca();
        animal.passeie();
        animal.durma();
    }

    public static void main(String[] args) {
        Zebra z1 = new Zebra(102, 99);
        Animal z2 = new Zebra(101, 107);
        Morcego m1 = new Morcego();
        Ornitorrinco o1 = new Ornitorrinco(25);

        cicloDeVida(z1);
        cicloDeVida(z2);
        cicloDeVida(m1);
        cicloDeVida(o1);
    }
}
