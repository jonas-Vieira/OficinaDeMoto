package Oficinar;

public class Servico {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        setPreco(preco);
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
        if (preco > 0 ){
            this.preco = preco;
        }else {
            System.out.println("PREÇO INVALIDO!");
        }
    }

    public void servico(){
        System.out.println("Descrição: " + descricao);
        System.out.printf("Valor: R$ %.2f%n", preco);
    }
}
