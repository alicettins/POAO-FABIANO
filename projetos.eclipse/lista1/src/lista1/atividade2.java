package lista1;
import java.util.Scanner;

public class atividade2 {


		public static void main(String[] args) {  

		Scanner sc = new Scanner(System.in);  

		String nomealuno;
		String nomeprofessor; 

		int media;
		

		System.out.println("Insira o nome do(a) professor(a)");  

		nomeprofessor = sc.next(); 
		
		System.out.println("Insira o nome do(a) aluno(a)");  

		nomealuno = sc.next(); 


		System.out.println("Digite a nota do 1º semestre:");  

		int nota1 = sc.nextInt(); 

		System.out.println("Digite a nota do 2º semestre:");  

		int nota2 = sc.nextInt(); 

		media =  (nota1 + nota2)/2; 
		System.out.println(media);
		
		

		System.out.println("Nome do(a) aluno(a):" + nomealuno);  
		
		System.out.println("Nome do(a) professor(a):" + nomeprofessor);  

		System.out.println("1º NOTA:" + nota1);  

		System.out.println("2º NOTA:" + nota2);  

		System.out.println("MÉDIA:" + media);  

		sc.close(); 

		} 

		} 

		 