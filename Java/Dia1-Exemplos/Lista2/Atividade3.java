package Lista2;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main (String []arg) {
		Scanner ler = new Scanner (System.in);
			
		double n1, n2, n3, n4, quad1, quad2, quad3, quad4;

		System.out.println("Digite um n�mero: ");
		n1= ler.nextDouble();
		System.out.println("Digite mais um n�mero:: ");
		n2= ler.nextDouble();
		System.out.println("Digite mais um n�mero: ");
		n3= ler.nextDouble();
		System.out.println("Digite mais um n�mero:: ");
		n4= ler.nextDouble();
				
		quad1 = Math.pow(n1, 2.0);
		quad2 = Math.pow(n2, 2.0);
		quad3 = Math.pow(n3, 2.0);
		quad4 = Math.pow(n4, 2.0);

  		if (quad3 >= 1000){
  			System.out.printf("\n O valor do quadrado do 3 n�mero � ", quad3);
  			}
   		
  		else {
  		System.out.println("\nO quadrado de "+ n1+" � igual "+ quad1);
		System.out.println("\nO quadrado de "+ n2+ " � igual "+ quad2);
		System.out.println("\nO quadrado de "+ n3+ " � igual "+ quad3);
		System.out.println("\nO quadrado de "+ n4+ " � igual "+ quad4);
		
		}
  		ler.close();
	}
}


