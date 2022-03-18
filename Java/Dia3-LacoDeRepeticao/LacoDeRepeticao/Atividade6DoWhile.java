package Lista1;

import java.util.Scanner;

public class Atividade6DoWhile {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double n = 0.00, s = 0.00, m = 0.00, cont = 0;
		
		do {
			System.out.print("Informe um número inteiro: ");
			n = ler.nextDouble();
				
			if(n%3==0) {
			
			s=s+n;
			cont++;
			}
			
		}while(n!=0);
		
		m=s/(cont-1) ;
		
		System.out.println("A média dos multiplos de 3 é: "+m);
		ler.close();
	}

}
