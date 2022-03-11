package br.edu.ifrn.sc.peoo.interfaces.parte2.itributavel;

public class Alimento implements ITributavel {

    private String descricao;
    private double preco;

    public Alimento() {
    }

    public Alimento(String descricao, double preco) {
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
        return preco * 0.12;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alimento{descricao=").append(descricao);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
