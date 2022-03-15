/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */
package br.edu.ifrn.sc.peoo.interfaces.parte1.transportador;

public class Onibus implements TransportadorDePessoas {

    @Override
    public void entraPessoas() {
        System.out.println("Abre as portas e entram as pessoas");
    }

    @Override
    public void saiPessoas() {
        System.out.println("Abre as portas e saem as pessoas");
    }

}
