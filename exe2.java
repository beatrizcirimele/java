package familia51;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner leia = new Scanner(System.in);	
	int[] numeros = new int[6];	
	int[] pares = new int[6];		
	int[] impares = new int[6];		
	
	int x, z, par = 0, impar = 0, somapar = 0;	
		
		System.out.println("Digite 6 numeors inteiros");
		for(x = 0; x <6; x++) {
	System.out.print(x+1+"° numero: ");	
	numeros[x] = leia.nextInt();		
			
		if(numeros[x] % 2 == 0) {
			pares[par] = numeros[x];
		    par++;
		    somapar += numeros[x];
		}else{
			impares[impar] = numeros[x];
			impar++;
		}
			
			
		}
		
		
	System.out.println("Os numeros pares foram: ");	


	for(x = 0; x < par; x++) {
			System.out.print(pares[x]+", ");
		}

	System.out.println("\nA soma dos numeros pares foi de: "+somapar);
	
	System.out.println("Os numeros impares foram: ");
	
	for(x = 0; x < impar; x++) {
		System.out.print(impares[x]+", ");
	}
	System.out.println("\nAquantidade de numeros impares foi de: "+impar);
	
	}

}


