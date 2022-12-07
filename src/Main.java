import RegistrandoVenda.registrarVenda;
import RegistrandoVenda.cadastrarVendedor;
import RegistrandoVenda.cadastrarProduto;
import java.util.InputMismatchException;
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
				#    Arthur Ramalho                                # 
				#    Lucas Muniz                                   # 
				####################################################
				      """);
	};
	public static void main(String[] args) {
		String opcao = "0";
		Scanner leitor = new Scanner(System.in);

		do {
			menu();
			System.out.print("\nDigite uma opção do menu: ");
			try {
				opcao = leitor.nextLine();
				if (!opcao.equals("9")){
					switch (opcao) {
						case "1" -> {cadastrarVendedor.main();
						}
						case "2" -> {cadastrarProduto.main();
						}
						case "3" -> {registrarVenda.main();
						}
						case "4" -> {
							if (registrarVenda.venda == null){
								System.out.println("Primeiro vc tem que registrar a venda");
							} else {
								registrarVenda.venda.imprimir();
							}
						}
						default -> {
							System.out.println("\n\nOpção invalida!! Digite 1, 2, 3 ou 9 para encerrar.\n\n");}
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("\n\n");
				System.out.println("Por favor, esse campo só aceita numeros!!");
				System.out.println("\n\n");
			}
		} while (!opcao.equals("9"));
	}
}

