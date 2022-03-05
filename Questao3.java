import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// S armazena o valor da string a ser criptografada
		String s = input.nextLine();
		
		// Esse trecho de codigo retira todos os espaços de um string
		s = s.replaceAll(" ","");
		
		// Obtem o tamanho da string modificada
		int tamanho = s.length();
		
		//Aqui nesse trecho de codigo obtem o intervalo onde a raiz quadrada do 
		//tamanho da string se encontra
		int valorMaximo = (int) Math.ceil(Math.sqrt(tamanho));
		int valorMinimo = (int) Math.floor(Math.sqrt(tamanho));
		
		
		int[] valores = new int[2];
		
		valores[0] = valorMinimo;
		valores[1] = valorMaximo;
		
		int linha = 0;
		int coluna = 0;
		
		int areaMinima = 0;
		
		/*
		 * da linha 38 a 65 é responsável por obter o conjunto de linha e colunas
		 * que satisfaçam aos requisitos do problema
		 * */
		for(int i=0; i<valores.length; i++) {
			
			for(int j=0; j< valores.length; j++) {
				
				
				
				if(valorMinimo <= valores[i] && valores[i] <= valores[j] && valores[j] <= valorMaximo) {
					
					
					if((valores[i] * valores[j]) >= tamanho ) {
						
						
						if(areaMinima == 0) {
						
							linha = valores[i];
							coluna = valores[j];
							areaMinima = linha* coluna;

						// esse trecho é responsavel por obter o conjunto de linhas
						// e colunas que tenham menor area possivel
						}else if((valores[i] * valores[j]) <= areaMinima) {
							
							linha = valores[i];
							coluna = valores[j];
							areaMinima = linha* coluna;
						}
					}
				}
			}
		}
		
		String[][] matrizCriptada = new String[linha][coluna]; 
		
		int contCaracter = 0;
		// Os codigos a seguir são resposáveis por organizar a string na matriz
		
		for(int i=0; i < linha; i++) {
			
			for(int j=0; j< coluna; j++) {
				
				
				if(contCaracter < s.length()) {
					
					matrizCriptada[i][j] = s.charAt(contCaracter)+"";
					
					contCaracter ++;
					
				}else {
					
					// caso a string seja menor que o numero de posições da matriz
					// são prenxido com uma string vazia.
					matrizCriptada[i][j] = "";
					
				}
				
				
				
			}
		}
		
		// Imprime a string criptografada
		
		String strCriptografada = "";
		
		for(int i=0; i< coluna; i++) {
			
			for(int j=0; j< linha; j++) {
				
				strCriptografada += matrizCriptada[j][i];
			}
			strCriptografada += " ";
		}
		
		System.out.println(strCriptografada);
	}
	

}
