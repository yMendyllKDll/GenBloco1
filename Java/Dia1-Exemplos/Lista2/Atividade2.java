package Lista2;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main (String []arg) {
		
		Scanner ler = new Scanner (System.in);
		
		int C,N,E,S,EX;
		
		System.out.println ("Digite as horas trabalhadas: ");
		N = ler.nextInt();
		
		System.out.println ("Digite o c�digo do trabalhador: ");
		C = ler.nextInt();
		
		if(N>50) {
			E = N-50;
			EX = E*20;
			S = 50*10;
			System.out.println ("C�digo do trabalhador: "+C);
			System.out.println ("S�lario total: "+S);
			System.out.println ("Hora Extra: "+E);
			System.out.println ("S�lario Extra: "+EX);			
	}
		else {
			E=0;
			S=N*10;
			System.out.println ("C�digo do trabalhador: "+C);
			System.out.println ("S�lario total: "+S);
			System.out.println ("Hora Extra: "+E);
		}
		ler.close();
	}

}
