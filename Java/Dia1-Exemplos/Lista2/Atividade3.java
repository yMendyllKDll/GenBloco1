package Lista2;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main (String []arg) {
		Scanner ler = new Scanner (System.in);
			
		double n1, n2, n3, n4, quad1, quad2, quad3, quad4;

		System.out.println("Digite um número: ");
		n1= ler.nextDouble();
		System.out.println("Digite mais um número:: ");
		n2= ler.nextDouble();
		System.out.println("Digite mais um número: ");
		n3= ler.nextDouble();
		System.out.println("Digite mais um número:: ");
		n4= ler.nextDouble();
				
		quad1 = Math.pow(n1, 2.0);
		quad2 = Math.pow(n2, 2.0);
		quad3 = Math.pow(n3, 2.0);
		quad4 = Math.pow(n4, 2.0);

  		if (quad3 >= 1000){
  			System.out.printf("\n O valor do quadrado do 3 número é ", quad3);
  			}
   		
  		else {
  		System.out.println("\nO quadrado de "+ n1+" é igual "+ quad1);
		System.out.println("\nO quadrado de "+ n2+ " é igual "+ quad2);
		System.out.println("\nO quadrado de "+ n3+ " é igual "+ quad3);
		System.out.println("\nO quadrado de "+ n4+ " é igual "+ quad4);
		
		}
  		ler.close();
	}
}


