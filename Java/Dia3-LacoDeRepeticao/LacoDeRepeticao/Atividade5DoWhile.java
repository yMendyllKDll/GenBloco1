package Lista1;

import java.util.Scanner;

public class Atividade5DoWhile {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int n=0, s=0;
		
		do {
			System.out.print("Informe um número: ");
			n = ler.nextInt();
						
			s=s+n;
			
			
		}while(n!=0);
		
		
		
		System.out.println("A soma dos números impressoas é: "+ s);
		ler.close();
	}

}
