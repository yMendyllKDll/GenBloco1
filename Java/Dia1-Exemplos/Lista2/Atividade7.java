package Lista2;

import java.util.Scanner;

public class Atividade7 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double base, altura, area;
		System.out.println ("Para calcular a �rea do tri�ngulo ret�ngulo informe o valor da base: ");
		base = ler.nextDouble();
		System.out.println ("Agora informe o valor da altura: ");
		altura = ler.nextDouble();

		if (base >0 && altura >0){
			area= ((base*altura)/2);
			System.out.println ("A �rea do tri�ngulo �: "+ area);
		}
		else {
			System.out.println ("N�o � poss�vel calcular pois o valor n�o � v�lido");
		}
		ler.close();
		
		}

}
