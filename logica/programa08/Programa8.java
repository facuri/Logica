package programa08;

import java.util.Scanner;

/*PROGRAMA NOMESCOMC
Programa para mostrar uma listagem com nomes que comecem com C
  */
public class Programa8 {
	
	public static void main(String[]args){
		
		Scanner ent = new Scanner(System.in);
		String nome;
		int i, tot;
		String soC[] = new String[5];
		tot = 0;
		
		for(i = 0; i < 5; i++){
			System.out.print("Digite o " + i + " nome: ");
			nome = ent.next();
			
			if(nome.charAt(0) == 'C'){
			    tot++;
				soC[tot] = nome;
			 }
		  }
		System.out.println("---Listagem Final----");
		for(i = 0; i <= tot; i++){
			 if (soC[i] != null) 
			    System.out.println(soC[i]);
			
		 }

		
	 }

}
