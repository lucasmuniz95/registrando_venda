package RegistrandoVenda;

import static RegistrandoVenda.cadastrarVendedor.leitor;

public class registrarVenda {
    public static Venda venda = new Venda();

    public static void main() {
        System.out.println("\nIniciando a venda...\n\n");
        System.out.println("Adicionando vendedor...\n\n");
        venda.getVendedor();
        System.out.println("Adicionando produto...\n\n");
        venda.getProduto();
        System.out.printf("Digite a quantidade de itens: ");
        venda.setQuantidadeItens(leitor.nextInt());
        System.out.printf("Digite o percentual de desconto da compra(Se não houver aperte 0): ");
        venda.setDesconto(leitor.nextInt());
        venda.calcular_valor();
        venda.calcular_comissao();
        System.out.println("Venda realizada com sucesso!!");
        System.out.println("Utilize a opção 4 para imprimir a venda.");
        venda.vendas.add(venda);
    }
}
