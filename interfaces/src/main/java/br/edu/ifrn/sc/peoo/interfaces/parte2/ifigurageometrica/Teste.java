/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
*/

package br.edu.ifrn.sc.peoo.interfaces.parte2.ifigurageometrica;

public class Teste {
    public static void main(String[] args) {
        IFiguraGeometrica l1 = new Losango(4);
        IFiguraGeometrica r1 = new Retangulo(5, 2);
        
        System.out.println("Perimetro do losango: " + l1.calcularPerimetro());
        System.out.println("Perimetro do retangulo: " + r1.calcularPerimetro());
    }
}
