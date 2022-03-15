/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte2.ifigurageometrica;

public class Losango implements IFiguraGeometrica {

    private int lado;

    public Losango() {
    }

    public Losango(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

}
