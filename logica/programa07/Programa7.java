package programa07;

import java.util.Scanner;

/*PROGRAMA FATORIALFUNCAO
Programa para calcular o fatorial de um n�mero
usando fun��o ou m�todo com retorno.
*/
public class Programa7 {
	
	 static int n, c;
	
   public static void main(String[] args) {
	   
	   Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		n = ent.nextInt();
		c = n;
		System.out.println("O fatorial de " + c + " �: " + mostrarFatorial(n));
	   
		 
	}
   //m�todo com retorno
   public static int mostrarFatorial(int v){
		int f;
		f = 1;
		do{
			f *= v;
			v --;
		}while(v >= 1);
		return f;
	}

}
