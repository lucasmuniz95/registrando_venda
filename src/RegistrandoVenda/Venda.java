package RegistrandoVenda;

import static RegistrandoVenda.cadastrarProduto.produto;

public class Venda {

    private Produto produto;

    public Venda() {
    }

    private Vendedor vendedor;
    private double desconto;
    private int quantidadeItens;
    private double valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcular_valor() {
        setValor(produto.getValorVenda() * quantidadeItens);
    }

    public void efetuar_desconto(double porcentagem_desconto) {
        porcentagem_desconto = porcentagem_desconto / 100;
        desconto = (cadastrarProduto.produto.getValorVenda() * porcentagem_desconto) * this.getQuantidadeItens();
    }

    public double calcular_comissao() {
        double comissao = this.valor * (vendedor.getComissao() / 100);
        if (produto.isPromocao()) {
            vendedor.setComissao(comissao / 2);
        } else {
            vendedor.setComissao(comissao);
        }
        return comissao;
    }


    public void imprimir() {
        System.out.println("COD Vendedor: " + vendedor.getCodigo());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Comissão: R$ " + calcular_comissao());
        System.out.println("COD Produto: " + produto.getCodigo());
        System.out.println("Descrição Produto: " + produto.getDescricao());
        System.out.println("QTD Itens: " + quantidadeItens);
        System.out.println("Valor Produto: R$ " + produto.getValorVenda());
        System.out.println("Valor da venda: R$ " + valor);

        if (cadastrarProduto.produto.isPromocao()) {
            System.out.println("Produto em promoção");
        } else {
            System.out.println("Produto não está na promoção");
        }

        System.out.println("Valor Desconto: R$ " + desconto);
        System.out.println("Valor Total: R$ " + (valor - desconto));


    }
}
