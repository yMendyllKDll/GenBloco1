package Lista1;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double n, r, q;
			
			System.out.print("Digite um n�mero: ");
			n = ler.nextDouble();
			
			if(n%2 == 0) {
				System.out.print("N�mero � par\n");
				r = Math.sqrt(n);
				System.out.printf("Raiz quadrada de %.2f � igual � %.2f", n, r);
			}
			else if(n%2 != 0) {
				System.out.print("N�mero � �mpar\n");
				q = Math.pow(n, 2);
				System.out.printf("%.2f ao quadrado � %.2f", n, q);
			}
			ler.close();
	}

}
