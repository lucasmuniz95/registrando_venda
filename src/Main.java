import RegistrandoVenda.registrarVenda;
import RegistrandoVenda.cadastrarVendedor;
import RegistrandoVenda.cadastrarProduto;
import RegistrandoVenda.Produto;
import RegistrandoVenda.Venda;
import RegistrandoVenda.Vendedor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("""
				 >>>>>>>>>>>>         Uniesp         >>>>>>>>>>>>>>
				#              Centro Universitario                #
				#                                                  #
				#                      Menu                        #
				#                                                  #
				#    Digite [1] para cadastrar um Vendedor         #
				#    Digite [2] para registrar um produto          #
				#    Digite [3] para registrar uma venda           #
				#    Digite [4] para exibir o resumo da venda      #
				#                                                  #           
				#         Se quiser encerrar o programa            #
				#                                                  #                    
				#                   [9] - Sair                     # 
				#                                                  #
				#    Grupo:                                        #
				#    Gabriel Santana                               #
				#    Marcio Alex                                   #
				#    Antonio Brust                                 #
				#    Arthur                                        # 
				#    Lucas Muniz                                   # 
				####################################################
				      """);
		Scanner leitor = new Scanner(System.in);


		int opcao = 0;
		while (opcao != 9) {
			System.out.printf("\nDigite uma opção do menu: ");
			opcao = leitor.nextInt();

			switch (opcao) {
				case 1: {
					cadastrarVendedor.main();
					break;
				}
				case 2: {
					cadastrarProduto.main();
					break;
				}
				case 3: {
					System.out.println(registrarVenda.venda.getProduto());
					registrarVenda.main();
					break;
				}
				case 4: {
					registrarVenda.venda.imprimir();
				}
				case 9: {
					System.out.println("Programa encerrado!");
					break;
				}
				default: {
					System.out.println("Opção invalida!! Digite 1, 2, 3 ou 9 para encerrar.");
				}
			}
		}
	}
}
