package Lista2;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double varN;

		System.out.println ("Digite um n�mero: ");
		varN = ler.nextDouble();

		if (varN >100){
			System.out.println ("O valor informado �: "+ varN);
		}
		else {
			System.out.println ("O valor informado � menor que 100, ent�o o resultado � 0");
		}
		ler.close();
	}

}
