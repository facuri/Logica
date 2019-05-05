package programa02;

import java.util.Scanner;

/*PROGRAMA DISSECANDOMATRIZES 
Programa para preencher uma matriz de quarta ordem e mostrar:
- A matriz completa
- Os elementos da diagonal principal
- Os elementos do triangulo superior
- Os elementos do triangulo inferior
*/
public class Programa2 {
    // Variáveis Státicas
	static int m[][] = new int[4][4];
	static int l, c, op;
	
	public static void main(String[] args) {

		 Scanner ent = new Scanner(System.in);

		for (l = 0; l < 4; l++) {
			for (c = 0; c < 4; c++) {
				System.out.print("Digite o valor da posição[" + l + "][" + c + "]: ");
				m[l][c] = ent.nextInt();
			}

		}
		do {
			menu();
			System.out.print("Escolha a opção: ");
			op = ent.nextInt();
            //Switch Case
			switch (op) {
			   case 1:
				 mostraMatriz();
				 break;
			   case 2:
				 diagonalPrincipal();
				 break;
			   case 3:
				 trianguloSuperior();
				 break;
			   case 4:
				 trianguloInferior();
				 break;

			}
		} while (op != 5);
		System.out.println("Fim!!");

	}
   //Métodos Void(Sem retorno)
	public static void menu() {
		System.out.println("\nMenu de opções" + "\n[1] - Mostrar a matriz " + "\n[2] - Diagonal principal"
				           + "\n[3] - Triangulo superior" + "\n[4] - Triangulo inferior" + "\n[5] - Sair");

	}
	public static void mostraMatriz(){
		System.out.println("Matriz");
		for (l = 0; l < 4; l++) {
			for (c = 0; c < 4; c++) {
				System.out.print(m[l][c] + " ");
			}
			System.out.println();
		}
		
	}
	public static void diagonalPrincipal(){
		System.out.print("Diagonal principal: ");
		 for (l = 0; l < 4; l++) {
			for (c = 0; c < 4; c++) {
				if (l == c)
					System.out.print(m[l][c] + ", ");

			}
		}
		
	}
	public static void trianguloSuperior(){
		 System.out.print("Triangulo superior: ");
		 for (l = 0; l < 3; l++) {
			for (c = l + 1; c < 4; c++) {
				System.out.print(m[l][c] + ", ");

			}
		}
		
	}
	public static void trianguloInferior(){
		 System.out.print("Triangulo inferior: ");
		 for (l = 1; l < 4; l++) {
			for (c = 0; c < l - 0; c++) {
				System.out.print(m[l][c] + ", ");
			}
		}
		
	}

}
