package Lista2;

import java.util.Scanner;

public class Atividade4 {
	
public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int valor; 

		System.out.println ("digite um n�mero inteiro: ");
		valor = ler.nextInt();
		
		if (valor == 0) {
			System.out.println ("o n�mero digitado � neutro");	
		}


		else if (valor <0){
			System.out.println ("o valor � negativo ");
		}
		else if (valor > 0 && (valor % 2) == 0 ){
			System.out.println ("o valor � positivo e par");
		}

		
		else if (valor > 0 && (valor % 2) != 0) {
			System.out.println ("o n�mero � positivo e �mpar");
		}
		ler.close();
	}

}