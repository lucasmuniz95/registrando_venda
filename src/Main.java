import RegistrandoVenda.registrarVenda;
import RegistrandoVenda.cadastrarVendedor;
import RegistrandoVenda.cadastrarProduto;
import RegistrandoVenda.Produto;
import RegistrandoVenda.Venda;
import RegistrandoVenda.Vendedor;

import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("""
				 >>>>>>>>>>>>         Uniesp         >>>>>>>>>>>>>>
				#              Centro Universitario                #
				#                                                  #
				#                      Menu                        #
				#                                                  #
				#    Digite [1] para cadastrar um Vendedor         #
				#    Digite [2] para cadastrar um produto          #
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
	};
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);


		int opcao = 0;
		while (opcao != 9) {
			System.out.println("\n\n");
			menu();
			System.out.printf("\nDigite uma opção do menu: ");
			opcao = leitor.nextInt();
			System.out.println("\n");

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
					registrarVenda.main();
					break;
				}
				case 4: {
					registrarVenda.venda.imprimir();
					break;
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
