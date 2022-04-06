package familia51;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		
		/* 3- Leia uma matrix 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
	int x,y,somanumeros=0;

	
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
	System.out.println("\nDigite um numero");		
		matriz[x][y] = leia.nextInt();		
				
				if(matriz[x][y] > 10 ) {
					somanumeros++;
				}				
			}
		}
		
		System.out.println("A quantidade de numeros maiores que 10 foi de "+somanumeros);
		
	}

}