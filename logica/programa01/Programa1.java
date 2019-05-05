package programa01;

import java.util.Scanner;

/*PROGRAMA NÚMEROS PRIMOS
Elabore um programa para mostrar os números primos existentes em um intervalo.
O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final) 
e os números primos existentes no intervalo ([inicial, final]) devem ser separados 
por um espaço em branco.
Exemplo:
Entrada: 2 13
Saída: 2 3 5 7 11 13
*/
public class Programa1 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int numFinal, numInicial;
		boolean primo;
		
		System.out.print("Digite o número inicial: ");
		numInicial = ent.nextInt();
		System.out.print("Digite o número final: ");
		numFinal = ent.nextInt();

        System.out.print("Números Primos entre " + numInicial + " e " + numFinal + " são: ");
		for(int i = numInicial; i <= numFinal; i++) {
               primo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    primo = false;
                    break;
                }
            }

            if(primo)//verdadeiro
                System.out.print( i + " ");
              
            }
        }

	}
 
 
		 
 
	 
