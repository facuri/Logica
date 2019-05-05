package programa01;

import java.util.Scanner;

/*PROGRAMA N�MEROS PRIMOS
Elabore um programa para mostrar os n�meros primos existentes em um intervalo.
O usu�rio dever� fornecer os valores inicial (inicial > 0) e final (inicial < final) 
e os n�meros primos existentes no intervalo ([inicial, final]) devem ser separados 
por um espa�o em branco.
Exemplo:
Entrada: 2 13
Sa�da: 2 3 5 7 11 13
*/
public class Programa1 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int numFinal, numInicial;
		boolean primo;
		
		System.out.print("Digite o n�mero inicial: ");
		numInicial = ent.nextInt();
		System.out.print("Digite o n�mero final: ");
		numFinal = ent.nextInt();

        System.out.print("N�meros Primos entre " + numInicial + " e " + numFinal + " s�o: ");
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
 
 
		 
 
	 
