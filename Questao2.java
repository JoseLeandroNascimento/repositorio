import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Como no enuciado não informado se deveria ser fornecido um valor
		// pro tamanho do array foi fornecido um valor estatico.
		int[] n = new int[5];
		
		for(int i=0; i< n.length; i++) {
			
			n[i] = input.nextInt();
		}
		
		
		int x = input.nextInt();
		
		// cont armazena a quantidade de pares de valores que atendem aos requisitos
		
		int cont = 0;
		
		
		// Nesse cenário como não foi exigido que os pares fossem diferente
		// Os pares podem ser o mesmo elemento.
		for(int i=0; i<5; i++) {
			
			for(int j=0; j< 5; j++) {
				
				if((n[i] - n[j]) == x) {
					
					cont ++;
				}
			}
		}
		
		System.out.println(cont);
		
	}

}
