package programa03;

import java.util.Scanner;

/*PROGRAMA PRODUTO 
O programa cadastra 5 produtos, c�digo, nome e o pre�o.
Em seguida, imprime uma lista com o c�digo e o nome de cada um. 
Por �ltimo, consulta o nome e o pre�o de um produto por meio de seu c�digo.
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
			System.out.print("Digite o pre�o do produto: R$");
			preco[i] = ent.nextDouble();
		 }
		System.out.println("\n----Lista dos Proudutos----");
		for(i = 0; i <= 4; i++){
			System.out.println("C�digo do produto: " + codigo[i] + 
					           "\nNome do produto: " + nome[i]);
			
		}
		System.out.print("\nDigite o c�digo do produto: ");
		codigoDigitado = ent.nextInt();
		
		for(i = 0; i <= 4; i++){
			if(codigoDigitado == codigo[i]){
				System.out.println("Nome do produto: " + nome[i] + 
						           "\nPre�o do produto: R$" + preco[i]);
				
			}
			
		}

	}

}

		
  

 
