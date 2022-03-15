package Lista1;

import java.util.Scanner;

public class Atividade4 {
	
		public static void main (String[] args ) {
		
			Scanner ler = new Scanner (System.in);
		
			double varA,varB,varC,r,s,d;
		
			System.out.println("Digite um valor inteiro e positivo para A: ");
			varA = ler.nextDouble();
			System.out.println ("Digite um valor inteiro e positivo para B: ");
			varB = ler.nextDouble();
			System.out.println("Digite um valor inteiro e positivo para C: ");
			varC = ler.nextDouble();

			r=Math.pow((varA+varB),2);
		
			s=Math.pow((varB+varC),2);

			d=(r+s)/2;

			System.out.println("Então o valor de D na expressão é: "+ d);
		
			ler.close();
		
	}

}
