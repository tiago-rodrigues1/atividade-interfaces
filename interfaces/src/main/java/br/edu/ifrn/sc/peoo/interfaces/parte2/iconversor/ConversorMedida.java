/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
*/

package br.edu.ifrn.sc.peoo.interfaces.parte2.iconversor;

public class ConversorMedida implements IConversor {

    @Override
    public double converter(double valor) {
        return valor * 0.393701;
    }

}
