package programa05;

import java.util.Scanner;

/*PROGRAMA MERCADORIA
Uma loja está levantando o valor total de todas as mercadorias em estoque. 
Escreva um programa que permita a entrada das seguintes informações: 
a)O valor de cada mercadoria.
b)Perguntar ‘MAIS MERCADORIAS (S/N)?’.
Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 */
public class Programa5 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		double valorMercadoria, somaMercadoria, media;
		int i, contaMercadorias;
		String resposta = "";
		resposta.equals("s");
		somaMercadoria = 0;
		contaMercadorias = 0;
		
		do{
			System.out.print("Digite o valor da mercadoria: R$");
			valorMercadoria = ent.nextDouble();
			
			contaMercadorias++;
			somaMercadoria += valorMercadoria;
			
			System.out.print("Mais mercadorias(S/N)?: ");
			resposta = ent.next();
			
		}while( resposta.equals("s"));
		
		 media = somaMercadoria / contaMercadorias;
		
		System.out.println("\nO valor total do estoque: R$" + somaMercadoria +
				           "\nA média do valor das mercadorias: " + media );

	}
}

