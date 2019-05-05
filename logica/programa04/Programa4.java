package programa04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*PROGRAMA FORCA
  Tente adivinhar a palavra escolhida,
  voc� t�m 6 chances.
*/
public class Programa4 {

	public static void main(String[] args) throws IOException {
		 
		  String palavraL = new String();

	        String palavra;
	        String letra;
	        char chute;
	        char[] copiaPalavra;
	        int i = 0, fim = 0, encontrei;
	        int nTentativas = 0, limiteTentativas, corretas = 0;

	        //Palavra escolhida
	        try{
	            palavraL = "pinhal";


	        }catch(Exception e) {
	            System.out.println("Erro!");
	        }
	        //Busca uma palavra
	        palavra = palavraL.toUpperCase();

	        //Cria array de char contendo espa�os para armazenar respostas
	        int tamanhoPalavra = palavra.length();
	        char[] tentativa = new char [tamanhoPalavra];
	        for(i = 0; i <  tamanhoPalavra; i++){
	            tentativa[i] = ' ';
	        }
	        //Prepara o vetor de char de refer�ncia
	        copiaPalavra = palavra.toCharArray();

	        //Define o limite das tentativas
	        limiteTentativas = palavra.length();

	        do{
	             
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader stdin = new BufferedReader(isr);
	             
	            //Apresenta o cabe�alho do jogo
	            System.out.println("\n FORCA EM JAVA");
	            System.out.println("_________________\n");

	            //Apresenta letras j� encontradas
	            for(i = 0; i < tamanhoPalavra; i++){
	                System.out.print(" " + tentativa[i] + " ");
	            }
	            System.out.println();

	            //Apresenta marcas das posi��es das letras
	            for(i = 0; i < tamanhoPalavra; i++){
	                System.out.print("__ ");
	            }
	            System.out.println();

	            //Informa��es do andamento do jogo
	            System.out.println("_________________________");
	            System.out.print("Restantes: ");
	            System.out.print(limiteTentativas - nTentativas);
	            System.out.print(" - Corretas ");
	            System.out.println(corretas);
	            System.out.println("______________________________");

	            //******* Respostas do Jogador **************

	            //Ler respostas do jogador
	            System.out.print("\nEntre com uma letra (ou * para encerrar) + <enter>: ");
	            letra = stdin.readLine().toUpperCase();
	            chute = letra.charAt(0);

	            //Testa se a letra informada encontra-se na palavra escolhida
	            encontrei = 0;
	            for(i = 0; i < tamanhoPalavra; i++){
	                if(copiaPalavra[i] == chute){
	                  copiaPalavra[i] = '*';
	                  tentativa[i] = chute;
	                  corretas++;
	                  encontrei = 1;
	               }

	           }
	           if(encontrei == 0) nTentativas++;
	               
	           if(nTentativas >= limiteTentativas || corretas == tamanhoPalavra || chute == '*')
	               fim = 1;
	               

	           }while(fim == 0);
	          
	          //Mensagem na conclus�o do jogo
	          if(nTentativas >= limiteTentativas){
	             System.out.println("\n****** Que pena!! Tente novamente!! ******");
	             System.out.println("A palavra foi: " + palavra);
	          } else if(chute != '*'){
	              System.out.println("\n****** PARAB�NS*****");
	              System.out.println("Voc� acertou: " + palavra);

	          }


	     } 

	}

