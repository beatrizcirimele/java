package familia51;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int[] a = new int[6];
	
	int b, x = 0;	
		
a[0] = 1; a[1] = 0; a[2] = 5; a[3] = -2; a[4] = -5; a[5] = 7; 		
		
b = a[0] +	a[1] + a[5];
		
a[3] = 100;		
		
System.out.println("O resultado foi");		
		
		for(x = 0; x < 6; x++) {
			
		System.out.println(a[x]);
		
		}
		System.out.println("\nA soma dos valores em a[0], a[1] e a[5]"+b);
		
		
	}

}


