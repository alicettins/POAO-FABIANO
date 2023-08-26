package lista1;
import java.util.Scanner;
public class ATIVIDADE1 {
	

		public static void main(String[] args) {  

		Scanner sc = new Scanner(System.in);  

		String nome; 
		double resultado;
		

		System.out.println("Digite o nome do cliente");  

		nome = sc.next(); 


		System.out.println("Digite o 1º valor:");  

		int valor1 = sc.nextInt(); 

		System.out.println("Digite o 2º valor:");  

		int valor2 = sc.nextInt(); 

		resultado = valor1 / valor2; 
		System.out.println(resultado);
		
		

		System.out.println("Nome:" + nome);  

		System.out.println("1º valor:" + valor1);  

		System.out.println("2º valor:" + valor2);  

		System.out.println("Resultado:" + resultado);  

		sc.close(); 

		} 

		} 

		 