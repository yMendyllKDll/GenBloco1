package Lista1;

import java.util.Scanner;

public class Atividade3 {
	
			public static void main (String[]arg) {
		
				Scanner ler = new Scanner (System.in);
		
				double t,h,m,s;

				System.out.println("Digite o tempo de duração do evento em segundos");
				t = ler.nextDouble();
		
				h = (t/3600);
				m = ((t % 3600) / 60);
				s = ((t/3600) % 60);
		
				System.out.println("Horas: "+ h);
				System.out.println("\nMinutos: "+ m);
				System.out.println("\nSegundos: "+ s);
		
				ler.close();
	}

}
