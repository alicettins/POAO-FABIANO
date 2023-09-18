package lista2;
	import java.util.Scanner;
	public class atividade2 {
		public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	String senha;
	System.out.print("Digite a senha: ");
	senha = sc.nextLine();
	if (senha.equals("123")) {
	System.out.println("SENHA CORRETA");
	while (true) {
	System.out.println("\nMenu:");
	System.out.println("1. Cadastro de Cliente");
	System.out.println("2. Compra de Carro");
	System.out.println("3. Compra de Acessório");
	System.out.println("0. Sair");
	System.out.print("Escolha uma opção: ");
	int opcao = sc.nextInt();
	sc.nextLine();
	switch (opcao) {
	case 1:
	cadastrarCliente(sc);
	break;
	case 2:
	comprarCarro(sc);
	break;
	case 3:
	comprarAcessorio(sc);
	break;
	case 0:
	System.out.println("Saindo do programa.");
	sc.close();
	System.exit(0);
	default:
	System.out.println("Opção inválida");
	break;
	}
	}
	} else {
	System.out.println("ERRO DE SENHA");
	}
	sc.close();
	}
	private static void cadastrarCliente(Scanner scanner) {
	System.out.print("Digite o nome do cliente: ");
	String nome = scanner.nextLine();
	System.out.print("Digite o telefone do cliente: ");
	String telefone = scanner.nextLine();
	System.out.print("Digite o endereço do cliente: ");
	String endereco = scanner.nextLine();
	System.out.println("Cliente cadastrado:");
	System.out.println("Nome: " + nome);
	System.out.println("Telefone: " + telefone);
	System.out.println("Endereço: " + endereco);
	}
	private static void comprarCarro(Scanner scanner) {
	System.out.println("Opções de carros:");
	System.out.println("1. Hatch");
	System.out.println("2. Sedã");
	System.out.println("3. Crossover");
	System.out.print("Escolha um carro: ");
	int escolhaCarro = scanner.nextInt();
	scanner.nextLine();
	System.out.print("Digite a cor do carro: ");
	String corCarro = scanner.nextLine();
	System.out.print("Escolha a forma de pagamento: ");
	String formaPagamento = scanner.nextLine();
	System.out.println("Compra realizada:");
	System.out.println("Carro escolhido: " + escolhaCarro);
	System.out.println("Cor do carro: " + corCarro);
	System.out.println("Forma de pagamento: " + formaPagamento);
	}
	private static void comprarAcessorio(Scanner scanner) {
	System.out.print("Digite o nome do acessório: ");
	String nomeAcessorio = scanner.nextLine();
	System.out.print("Digite a quantidade desejada: ");
	int quantidade = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Acessório comprado:");
	System.out.println("Nome do acessório: " + nomeAcessorio);
	System.out.println("Quantidade: " + quantidade);
	}
	}
