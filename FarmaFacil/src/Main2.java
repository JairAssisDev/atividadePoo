import java.util.Scanner;
import com.farmacia.*;
import com.usuarios.*;

public class Main2 {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
        	
        	
        	System.out.println("====== MENU PRINCIPAL ======");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionario");
            System.out.println("0. Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
                System.out.print("Digite o ID do produto a ser comprado: ");
                int idCompra = scanner.nextInt();
                Produto produtoCompra = farmacia.buscarProdutoPorId(idCompra);
                if (produtoCompra != null) {
                    System.out.print("Digite a quantidade a ser comprada: ");
                    int quantidadeCompra = scanner.nextInt();
                    System.out.print("Digite 1 para atendente ou 2 para gerente: ");
                    int tipoAnalista = scanner.nextInt();
                    Atendente analista;
                    if (tipoAnalista == 1) {
                        analista = farmacia.getAtendente();
                    } else {
                        analista = farmacia.getGerente();
                    }
                    farmacia.realizarCompra(produtoCompra, quantidadeCompra, analista);
                } else {
                    System.out.println("Produto não encontrado.");
                }
                break;
            case 2:
            	 System.out.println("====== MENU PRINCIPAL ======");
                 System.out.println("1. Atendente");
                 System.out.println("2. Gerente");
                 int opcao1 = scanner.nextInt();
                 switch (opcao1) {
				case 1: {
					System.out.println("Ola Atendente");
					break;
				}
				case 2:{
					System.out.println("1. Adicionar Produto");
		            System.out.println("2. Remover Produto");
		            System.out.println("3. Verificar Estoque");
		            System.out.println("4. Analisar Item no Estoque");
		            System.out.println("5. Adicionar Item no Estoque");
		            int opcaoGerete= scanner.nextInt();
					
		            switch (opcaoGerete) {
					case 1:
	                    System.out.print("Digite o ID do produto: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // Limpar o buffer
	                    System.out.print("Digite o nome do produto: ");
	                    String nome = scanner.nextLine();
	                    System.out.print("Digite a descrição do produto: ");
	                    String descricao = scanner.nextLine();
	                    System.out.print("Digite o preço do produto: ");
	                    double preco = scanner.nextDouble();
	                    System.out.print("Digite a quantidade do produto: ");
	                    int quantidade = scanner.nextInt();
	                    Produto produto = new Produto(id, nome, descricao, preco, quantidade);
	                    farmacia.adicionarProduto(produto);
	                    System.out.println("Produto adicionado com sucesso!");
	                    break;
	                case 2:
	                    System.out.print("Digite o ID do produto a ser removido: ");
	                    int idRemover = scanner.nextInt();
	                    Produto produtoRemover = farmacia.buscarProdutoPorId(idRemover);
	                    if (produtoRemover != null) {
	                        farmacia.removerProduto(produtoRemover);
	                        System.out.println("Produto removido com sucesso!");
	                    } else {
	                        System.out.println("Produto não encontrado.");
	                    }
	                    break;
	                case 3:
	                    farmacia.imprimirEstoque();
	                    break;
	                case 4:
	                    System.out.print("Digite o ID do produto para análise: ");
	                    int idAnalise = scanner.nextInt();
	                    Produto produtoAnalise = farmacia.buscarProdutoPorId(idAnalise);
	                    if (produtoAnalise != null) {
	                        boolean disponivel = farmacia.analisarItemEstoque(produtoAnalise);
	                        if (disponivel) {
	                            System.out.println("O produto " + produtoAnalise.getNome() + " está disponível no estoque.");
	                        } else {
	                            System.out.println("O produto " + produtoAnalise.getNome() + " não está disponível no estoque.");
	                        }
	                    } else {
	                        System.out.println("Produto não encontrado.");
	                    }
	                    break;
	                case 5:
	                    System.out.print("Digite o ID do produto para adicionar ao estoque: ");
	                    int idAdicionar = scanner.nextInt();
	                    Produto produtoAdicionar = farmacia.buscarProdutoPorId(idAdicionar);
	                    if (produtoAdicionar != null) {
	                        System.out.print("Digite a quantidade a ser adicionada: ");
	                        int quantidadeAdicionar = scanner.nextInt();
	                        farmacia.adicionarItemEstoque(produtoAdicionar, quantidadeAdicionar);
	                    } else {
	                        System.out.println("Produto não encontrado.");
	                    }
	                    break;
						
					}
					System.out.print("Digite o ID do produto para adicionar ao estoque: ");
                    int idAdicionar = scanner.nextInt();
                    Produto produtoAdicionar = farmacia.buscarProdutoPorId(idAdicionar);
                    if (produtoAdicionar != null) {
                        System.out.print("Digite a quantidade a ser adicionada: ");
                        int quantidadeAdicionar = scanner.nextInt();
                        farmacia.adicionarItemEstoque(produtoAdicionar, quantidadeAdicionar);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
				} 
				}
					
				}
				
                 
                 
            System.out.println("====== MENU PRINCIPAL ======");
	    System.out.println("============================");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Verificar Estoque");
            System.out.println("4. Analisar Item no Estoque");
            System.out.println("5. Adicionar Item no Estoque");
            System.out.println("6. Realizar Compra");
            System.out.println("0. Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            
        }
    }
}
