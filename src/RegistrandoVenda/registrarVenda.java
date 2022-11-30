package RegistrandoVenda;

import static RegistrandoVenda.cadastrarProduto.produto;
import static RegistrandoVenda.cadastrarVendedor.leitor;
import static RegistrandoVenda.cadastrarVendedor.vendedor;

public class registrarVenda {
    public static Venda venda = new Venda();

    public static void main() {
        System.out.println("\nIniciando a venda...\n\n");
        System.out.println("Adicionando vendedor...\n\n");
        venda.setVendedor(vendedor);
        System.out.println("Adicionando produto...\n\n");
        venda.setProduto(produto);
        System.out.printf("Digite a quantidade de itens: ");
        venda.setQuantidadeItens(leitor.nextInt());
        System.out.printf("Digite o percentual de desconto da compra (Se não houver digite 0): ");
        venda.efetuar_desconto(leitor.nextDouble());
        venda.calcular_valor();
        venda.calcular_comissao();
        System.out.println("Venda realizada com sucesso!!");
        System.out.println("Utilize a opção 4 para imprimir a venda.");
    }
}