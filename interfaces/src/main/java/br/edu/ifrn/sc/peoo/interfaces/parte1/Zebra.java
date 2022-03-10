package br.edu.ifrn.sc.peoo.interfaces.parte1;

public class Zebra implements Animal {

    private int listras;
    private double peso;

    public Zebra(int listras, double peso) {
        this.listras = listras;
        this.peso = peso;
    }

    @Override
    public void nasca() {
        System.out.println("Zebra nasce");
    }

    @Override
    public void passeie() {
        System.out.println("Zebra passeia");
    }

    @Override
    public void durma() {
        System.out.println("Zebra dorme");
    }

    @Override
    public double peso() {
        return peso;
    }
    
    public void contaListras() {
        System.out.printf("Essa zebra tem %d listras\n", listras);
    }

}
