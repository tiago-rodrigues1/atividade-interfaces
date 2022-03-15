/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte1.zoovirtual;

public class Ornitorrinco implements Animal {

    private double peso;

    public Ornitorrinco(double peso) {
        this.peso = peso;
    }

    @Override
    public void nasca() {
        System.out.println("Ornitorrinco nasce");
    }

    @Override
    public void passeie() {
        System.out.println("Ornitorrinco passeia");
    }

    @Override
    public void durma() {
        System.out.println("Ornitorrinco dorme");
    }

    @Override
    public double peso() {
        return peso;
    }

}
