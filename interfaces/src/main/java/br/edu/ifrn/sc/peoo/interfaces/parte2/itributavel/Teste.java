/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
*/

package br.edu.ifrn.sc.peoo.interfaces.parte2.itributavel;

public class Teste {
    
    public static void main(String[] args) {
        ITributavel a1 = new Alimento("1kg de Feijão", 10);
        ITributavel c1 = new Cosmetico("Kayak", 150);
        
        
        System.out.printf("ICMS do Feijão: R$%.2f\n", a1.calcularICMS());
        System.out.printf("ICMS do Kayak: R$%.2f\n", c1.calcularICMS());
    }
}
