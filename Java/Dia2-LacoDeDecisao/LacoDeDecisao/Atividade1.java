package Lista1;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1=0,n2=0,n3=0;
		
		System.out.println("Digite um n�mero inteiro: ");
		n1 = ler.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		n2 = ler.nextInt();
		System.out.println("Digite mais um n�mero inteiro: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3 ) {
			System.out.println("O maior n�mero digitado �: " + n1);
		}
		else if (n1 < n2 && n2 > n3 ) {
			System.out.println("O maior n�mero digitado �: " + n2);
		}
		else {
			System.out.println("O maior n�mero digitado �: " + n3);

		}
		ler.close();
	}

}
