package RegistrandoVenda;

public class Main {
    public static void main(String[] args) {
        Produto produto_1 = new Produto(58, "Cerveja", 40, 15, false);
        Vendedor vendedor_1 = new Vendedor("Alírio", 103, "Rua 1");
        Venda venda1 = new Venda();
        venda1.setProduto(produto_1);
        venda1.setVendedor(vendedor_1);
        venda1.setQuantidadeItens(2);
        venda1.calcular_valor();
        venda1.calcular_comissao();
        venda1.imprimir();

        Produto produto_2 = new Produto(12, "Camisa", 100, 80, true);
        Vendedor vendedor_2 = new Vendedor("Machado", 98, "Rua 2");
        Venda venda2 = new Venda();
        venda2.setProduto(produto_2);
        venda2.setVendedor(vendedor_2);
        venda2.setQuantidadeItens(3);
        venda2.efetuar_desconto(10);
        venda2.calcular_valor();
        venda2.calcular_comissao();
        venda2.imprimir();

        Venda venda_3 = new Venda();
        venda_3.setProduto(produto_2);
        venda_3.setVendedor(vendedor_2);
        venda_3.setQuantidadeItens(2);
        venda_3.efetuar_desconto(30);
        venda_3.calcular_valor();
        venda_3.calcular_comissao();
        venda_3.imprimir();

    }
}
