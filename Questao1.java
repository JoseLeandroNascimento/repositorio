

import java.util.Arrays;
import java.util.Scanner;


public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//No enuciado da quest�o n�o informado o tamanho do array, devido a isso
		//Assumir um tamanho estatico igual a do exemplo fornecido.
		
		int[] arr = new int[5];
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = input.nextInt();
		}
		
		//Ap�s receber os dados. A fun��o nativa do java sort ordena o nosso array
		//Em ordem crescente
		
		Arrays.sort(arr);
		
		
		System.out.println(arr[2]);
	}

}
