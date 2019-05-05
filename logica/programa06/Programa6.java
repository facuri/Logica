package programa06;

/*PROGRAMA FIBONACCIPROCEDIMENTO
Programa para exibir os 15 primeiros elementos de uma série de
Fibonacci usando procedimento ou método sem retorno(void)
  */
public class Programa6 {
	
	public static int numAnterior, numAtual, numNovo, i;

	public static void main(String[] args) {
		
		numAnterior = 0;
		System.out.print(numAnterior + " ");
		numAtual = 1;
		System.out.print(numAtual + " ");
		
		 for(i = 3; i <= 15; i++){
			 proximoFibonacci();
			
		 }
		 

	}
	//método void(sem retorno)
	public static void proximoFibonacci(){
		numNovo = numAnterior + numAtual;
		numAnterior = numAtual;
		numAtual = numNovo;
		System.out.print(numNovo + " ");
	}

}
