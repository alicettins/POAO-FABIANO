package lista1;

import java.util.Scanner;

public class ATIVIDADE3 {
			   public static void main(String[] args) {
			    	Scanner sc = new Scanner(System.in);  

			  double valorTotal = 0.0;
			                
			   for (int i = 1; i <= 3; i++) {
			   System.out.println("PEDIDOS " + i);
			   System.out.print("Número da mesa: ");
			   int numMesa = sc.nextInt(); 
			   sc.nextLine();
			                    	
			   System.out.print("Nome da bebida ou refeição: ");
			   String nomeProduto =  sc.next(); 
			                    
			   System.out.print("Valor do produto: ");
			   double valorProduto = sc.nextDouble();
			                    
			   System.out.print("Quantidade: ");
			   int quantidade =  sc.nextInt(); 
			                    
			   double subtotal = valorProduto * quantidade;
			   valorTotal += subtotal;
			   
			   System.out.print("============================== "
			   System.out.println("Produto: " + nomeProduto);
			   System.out.println("Valor: " + valorProduto);
			   System.out.println("Quantidade: " + quantidade);
			   System.out.println("Subtotal: " + subtotal);
			   System.out.print("============================== "
			   System.out.println();
			                }

			   System.out.print("============================== "
			   System.out.println("Total da mesa " + valorTotal);
			   System.out.print("============================== "
			            sc.close();
			   }
 }
