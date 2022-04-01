   package familia51;

import java.util.Scanner;

public class LacoDefinicao {

		public static void main(String[] args) {
	
			int idade;
			Scanner leia= new Scanner(System.in);
         System.out.println("\nEntre com a sua idade: ");
         
         idade =  leia.nextInt();
         
			
         
         if (idade>=5 && idade<=7)
			{
        	    System.out.println("\nINFANTIL A");
			}
         else if ( idade>=8 && idade<=11)
			{
        	  System.out.println("\nINFANTIL B");
			}
         else if (idade>=12 && idade<=13)
			{
        	 System.out.println("\nJUVENIL A");
			}
         else if (idade>=14 && idade<=17)
			{
        	 System.out.println("\nJUVENIL B");
			}
         else if(idade>=18)
			{
        	 System.out.println("\nADULTO");
			}
			else
			{
				 System.out.println("\nSEM CATEGORIA");
			}
		}
	} 




