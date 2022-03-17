package Lista1;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double n, r, q;
			
			System.out.print("Digite um número: ");
			n = ler.nextDouble();
			
			if(n%2 == 0) {
				System.out.print("Número é par\n");
				r = Math.sqrt(n);
				System.out.printf("Raiz quadrada de %.2f é igual à %.2f", n, r);
			}
			else if(n%2 != 0) {
				System.out.print("Número é ímpar\n");
				q = Math.pow(n, 2);
				System.out.printf("%.2f ao quadrado é %.2f", n, q);
			}
			ler.close();
	}

}
