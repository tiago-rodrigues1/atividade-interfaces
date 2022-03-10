package br.edu.ifrn.sc.peoo.interfaces.parte1;

public class Morcego implements Animal {

    @Override
    public void nasca() {
        System.out.println("Morcego nasce");
    }

    @Override
    public void passeie() {
        System.out.println("Morcego passeia");
    }

    @Override
    public void durma() {
        System.out.println("Morcego dorme");
    }

    @Override
    public double peso() {
        return 4.5;
    }
}
