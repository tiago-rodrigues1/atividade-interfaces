/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte1.transportador;

public class Ave implements Aereo {

    @Override
    public void voa() {
        System.out.println("Bate as asas bem forte!");
    }

    @Override
    public void aterrisa() {
        System.out.println("Bate as asas mais fracos e põe os pés no chão");
    }

}
