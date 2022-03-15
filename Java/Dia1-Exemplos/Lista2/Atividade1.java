package Lista2;

import java.util.Scanner;

public class Atividade1 {
	
			public static void main (String [] args) {
					
					Scanner ler = new Scanner (System.in);
					
					double pesoTomate, multa;
			
					System.out.println ("Informe quantos kilos de tomate há [somente números]: ");
					pesoTomate = ler.nextDouble();
			
					if (pesoTomate > 50){
						multa = ((pesoTomate - 50) * 4);
						System.out.println ("Neste caso João deverá pagar a multa de: "+ multa);
					}
					else {
						System.out.println("A multa a ser paga é de ZERO reais, pois não excedeu o peso");
						
		}
					ler.close();
	}

}
