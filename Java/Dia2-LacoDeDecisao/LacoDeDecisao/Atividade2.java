package Lista1;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
		
			int n1,n2,n3;
		
			System.out.print("Digite o primeiro numero: ");
			n1 = ler.nextInt();
			
			System.out.print("Digite o segundo numero: ");
			n2 = ler.nextInt();
			
			System.out.print("Digite o terceiro numero: ");
			n3 = ler.nextInt();
        
			if (n1 < n2) {
	            if (n2 < n3) {
	                System.out.println(n1 + " " + n2 + " " + n3);
	            }
	            else if (n1 < n3) {
	                System.out.println(n1 + " " + n3 + " " + n2);
	            }
	            else {
	                System.out.println(n3 + " " + n1 + " " + n2);
	            }
	        }
	        else if (n2 < n3) {
	            if (n1 < n3) {
	                System.out.println(n2 + " " + n1 + " " + n3);
	            }
	            else {
	                System.out.println(n2 + " " + n3 + " " + n1);
	            }
	        }
	        else {
	            System.out.println(n3 + " " + n2 + " " + n1);
	        }
			ler.close();
	}

}
