package programa03;

import java.util.Scanner;

/*PROGRAMA PRODUTO 
O programa cadastra 5 produtos, código, nome e o preço.
Em seguida, imprime uma lista com o código e o nome de cada um. 
Por último, consulta o nome e o preço de um produto por meio de seu código.
*/
public class Programa3 {
	
	public static void main(String[]args){
		
		int codigo[] = new int[5];
		String nome[] = new String[5];
		double preco[] = new double[5];
		int codigoDigitado, i;
		Scanner ent = new Scanner(System.in);
		
		for(i = 0; i <= 4; i++){
			System.out.print("Digite o " + i + " codigo do produto: ");
			codigo[i] = ent.nextInt();
			System.out.print("Digite o " + i + " nome do produto: ");
			nome[i] = ent.next();
			System.out.print("Digite o preço do produto: R$");
			preco[i] = ent.nextDouble();
		 }
		System.out.println("\n----Lista dos Proudutos----");
		for(i = 0; i <= 4; i++){
			System.out.println("Código do produto: " + codigo[i] + 
					           "\nNome do produto: " + nome[i]);
			
		}
		System.out.print("\nDigite o código do produto: ");
		codigoDigitado = ent.nextInt();
		
		for(i = 0; i <= 4; i++){
			if(codigoDigitado == codigo[i]){
				System.out.println("Nome do produto: " + nome[i] + 
						           "\nPreço do produto: R$" + preco[i]);
				
			}
			
		}

	}

}

		
  

 
