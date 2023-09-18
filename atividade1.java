package lista2;

import java.util.Scanner;
public class atividade1 {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String nome;
	 int cnpj, renda;
	 int opcao = -1;
	 while (opcao != 0) {
	 System.out.println("Cadastro de empresas");
	 System.out.println("Digite o nome da empresa:");
	 nome = sc.next();
	 System.out.println("Digite o CNPJ:");
	 cnpj = sc.nextInt();
	 System.out.println("Digite a renda bruta mensal:");
	 renda = sc.nextInt();
	 System.out.println("Nome da empresa: " + nome);
	 System.out.println("CNPJ da empresa: " + cnpj);
	 System.out.println("Renda bruta mensal da empresa: " + renda);
	 System.out.println("Digite 0 para sair do programa");
	 System.out.println("(Diferente de 0) - Continuar cadastrando empresas");
	 opcao = sc.nextInt();
	 }
	 System.out.println("Cadastro(s) finalizado (s)!");
	 sc.close();
	 }
	}
