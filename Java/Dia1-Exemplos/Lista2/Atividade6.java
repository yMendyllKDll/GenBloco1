package Lista2;

import java.util.Scanner;

public class Atividade6 {
	
public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int idade;
		

		System.out.println ("Digite a idade do nadador: ");
		idade = ler.nextInt();

		if (idade < 5){
			System.out.println ("Esta n�o � uma idade v�lida. Permitido apenas a partir de 5 anos");
		}

		else if (idade >=5 && idade <= 7){
			System.out.println ("Este nadador pertence a categoria 'Infantil A' ");
		}

		else if (idade >=8 && idade <=11 ){
			System.out.println ("Este nadador pertence a categoria 'Infantil B' ");
		}
		else if (idade >=12 && idade <=13 ){
			System.out.println ("Este nadador pertence a categoria 'Juvenil A' ");
		}
		else if (idade >=14 && idade <=17 ){
			System.out.println ("Este nadador pertence a categoria 'Juvenil B' ");
		}
		else if (idade >=18 ){
			System.out.println ("Este nadador pertence a categoria 'Adultos' ");
		}
		ler.close();
		
	}

}
