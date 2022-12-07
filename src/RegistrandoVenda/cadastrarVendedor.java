package RegistrandoVenda;

import java.util.Scanner;

public class cadastrarVendedor {
    static Vendedor vendedor = new Vendedor();
    static Scanner leitor = new Scanner(System.in);
    public static void main() {
        System.out.printf("Digite o nome do vendedor: ");
        vendedor.setNome(leitor.nextLine());
        System.out.printf("Endereço: ");
        vendedor.setEndereco(leitor.nextLine());
        System.out.printf("Codigo: ");
        vendedor.setCodigo(leitor.nextInt());
        System.out.printf("Comissão: ");
        vendedor.setComissao(leitor.nextDouble());
        System.out.println("\nVendedor cadastrado com sucesso!");

    }
}