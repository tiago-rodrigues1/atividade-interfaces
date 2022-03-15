/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte2.iconversor;

public class ConversorMoeda implements IConversor {

    @Override
    public double converter(double valor) {
        return valor * 4.6;
    }

}
