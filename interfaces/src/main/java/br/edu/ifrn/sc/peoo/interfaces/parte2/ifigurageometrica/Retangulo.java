package br.edu.ifrn.sc.peoo.interfaces.parte2.ifigurageometrica;

public class Retangulo implements IFiguraGeometrica {

    private int base;
    private int altura;

    public Retangulo() {
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

}
