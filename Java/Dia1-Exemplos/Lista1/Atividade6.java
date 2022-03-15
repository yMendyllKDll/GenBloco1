package Lista1;

import java.util.Scanner;

public class Atividade6 {
	
			public static void main (String [] args) {
		
					Scanner ler = new Scanner (System.in);
		
					double  x1, x2, y1, y2, d;

					System.out.println("Digite o valor para x1: ");
					x1 = ler.nextDouble();
					System.out.println("Digite o valor para x2: ");
					x2 = ler.nextDouble();
					System.out.println("Digite o valor para y1: ");
					y1 = ler.nextDouble();
					System.out.println("Digite o valor para y2: "); 
					y2 = ler.nextDouble();

					d=(Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2)) ));
					System.out.println ("o resultado é: %.2f "+ d);
					
					ler.close();
	}

}
