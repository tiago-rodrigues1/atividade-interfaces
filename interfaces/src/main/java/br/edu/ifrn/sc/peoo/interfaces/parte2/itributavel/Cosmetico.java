package br.edu.ifrn.sc.peoo.interfaces.parte2.itributavel;

public class Cosmetico implements ITributavel {

    private String descricao;
    private double preco;

    public Cosmetico() {
    }

    public Cosmetico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularICMS() {
        return preco * 0.25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cosmetico{descricao=").append(descricao);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

}
