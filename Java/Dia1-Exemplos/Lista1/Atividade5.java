package Lista1;

import java.util.Scanner;

public class Atividade5 {
	
			public static void main (String [] args){
		
					Scanner ler = new Scanner (System.in);
			
					double nota1,nota2,nota3,media;
		
					System.out.println("Digite sua primeira nota: ");
					nota1 = ler.nextDouble();
					System.out.println("Digite sua segunda nota: ");
					nota2 = ler.nextDouble();
					System.out.println("Por �ltimo, escreva sua terceira nota: ");
					nota3 = ler.nextDouble();

					media=(((nota1*2) + (nota2*3) + (nota3*5))/10);

					System.out.println("Sua m�dia ponderada �: "+ media);
					
					ler.close();
	}
	

}
