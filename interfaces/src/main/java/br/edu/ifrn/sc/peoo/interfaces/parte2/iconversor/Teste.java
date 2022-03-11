package br.edu.ifrn.sc.peoo.interfaces.parte2.iconversor;

public class Teste {

    public static double useConversor(IConversor c, double valor) {
        return c.converter(valor);
    }

    public static void main(String[] args) {
        ConversorMoeda cmoeda = new ConversorMoeda();
        ConversorMedida cmedida = new ConversorMedida();

        double valorEuro = 5;
        double valorCentimetro = 12;

        System.out.printf("%.2f EUR = R$%.2f", valorEuro, useConversor(cmoeda, valorEuro));
        System.out.printf("%.2f cm = %.2f in", valorCentimetro, useConversor(cmedida, valorCentimetro));
    }
}
