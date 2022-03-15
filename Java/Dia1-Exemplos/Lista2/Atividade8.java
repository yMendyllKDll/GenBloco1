package Lista2;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double varN;

		System.out.println ("Digite um número: ");
		varN = ler.nextDouble();

		if (varN >100){
			System.out.println ("O valor informado é: "+ varN);
		}
		else {
			System.out.println ("O valor informado é menor que 100, então o resultado é 0");
		}
		ler.close();
	}

}
