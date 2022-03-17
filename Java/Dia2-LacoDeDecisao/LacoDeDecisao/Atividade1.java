package Lista1;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1=0,n2=0,n3=0;
		
		System.out.println("Digite um número inteiro: ");
		n1 = ler.nextInt();
		System.out.println("Digite outro número inteiro: ");
		n2 = ler.nextInt();
		System.out.println("Digite mais um número inteiro: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3 ) {
			System.out.println("O maior número digitado é: " + n1);
		}
		else if (n1 < n2 && n2 > n3 ) {
			System.out.println("O maior número digitado é: " + n2);
		}
		else {
			System.out.println("O maior número digitado é: " + n3);

		}
		ler.close();
	}

}
