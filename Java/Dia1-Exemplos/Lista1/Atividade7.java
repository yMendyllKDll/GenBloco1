package Lista1;

import java.util.Scanner;

public class Atividade7 {
	
		public static void main(String[] args) {
		
				Scanner ler = new Scanner(System.in);
			
				double a, b, c, d, x, f, e1, y;
				
				System.out.println("Digite um valor para 'a': ");
				a = ler.nextDouble();
			
				System.out.println("Digite um valor para 'b': ");
				b = ler.nextDouble();
			
				System.out.println("Digite um valor para 'c': ");
				c = ler.nextDouble();
			
				System.out.println("Digite um valor para 'd': ");
				d = ler.nextDouble();
			
				System.out.println("Digite um valor para 'e1': ");
				e1 = ler.nextDouble();
			
				System.out.println("Digite um valor para 'f': ");
				f = ler.nextDouble();
			
				x = (c*e1 - b*f)/(a*e1 - b*d);
				y = (a*f - c*d)/(a*e1 - b*d);
			
				System.out.println("X = %.2f"+x);
				System.out.println("\nY = %.2f"+y);
			
					ler.close();	
				
}

}
