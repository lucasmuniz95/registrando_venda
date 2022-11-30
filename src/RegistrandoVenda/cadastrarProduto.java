package RegistrandoVenda;

import static RegistrandoVenda.cadastrarVendedor.leitor;
import static RegistrandoVenda.cadastrarVendedor.vendedor;

public class cadastrarProduto {
    static Produto produto = new Produto();
    public static void main() {
        System.out.printf("Digite o codigo do produto: ");
        produto.setCodigo(leitor.nextInt());
        System.out.printf("Digite a descrição do produto: ");
        leitor.nextLine();
        produto.setDescricao(leitor.nextLine());
        System.out.printf("Digite o valor de custo do produto: ");
        produto.setValorCusto(leitor.nextDouble());
        System.out.printf("Digite o valor de venda do produto: ");
        produto.setValorVenda(leitor.nextDouble());
        System.out.printf("Digite 1 se produto estiver em promoção ou 2 se não estiver: ");
        int promocao = leitor.nextInt();
        if (promocao == 1){
            produto.setPromocao(true);
        } else {
            produto.setPromocao(false);
        }
        System.out.println("\n\nProduto cadastrado com sucesso!");
    }
}