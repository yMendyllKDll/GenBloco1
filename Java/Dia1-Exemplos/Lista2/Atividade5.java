package Lista2;

import java.util.Scanner;

public class Atividade5 {
	
public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double indice;

		System.out.println ("Por favor, informe o �ndice atual de polui��o: ");
		indice = ler.nextDouble();

		if (indice <0.25){
			System.out.println ("O �ndice est� dentro do aceit�vel, sendo assim todos os grupos podem continuar funcionando normalmente.");
		}

		else if (indice >0.25 && indice <0.3){
			System.out.println ("ATEN��O! O indice esta quase no limite para suspens�o das atividades do grupo 1 ");
		}
			 
		else if (indice >=0.3 && indice < 0.4){
			System.out.println ("As ind�strias do grupo 1 dever�o suspender suas atividades");
		}
		else if (indice >=0.4 && indice < 0.49){
			System.out.println ("As ind�strias dos grupos 1 e 2 dever�o suspender suas atividades");
		}

		else if (indice >=0.5){
			System.out.println ("As ind�strias de todos os grupos dever�o suspender suas atividades");
		}
		ler.close();
	}

}
