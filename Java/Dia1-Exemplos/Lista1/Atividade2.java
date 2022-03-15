package Lista1;

import java.util.Scanner;

public class Atividade2 {
			public static void main (String[]arg) {
				
				Scanner ler = new Scanner (System.in);
				
				int idade,anos,meses,dias;
				
				System.out.println("Digite sua idade em dias: ");
				idade = ler.nextInt();
				
				anos = idade / 365;
				meses = (idade % 365)/30;
				dias = (idade % 365)%30;
				
				System.out.println("Anos: "+ anos);
				System.out.println("Meses: "+ meses);
				System.out.println("Dias: "+ dias);
				
				ler.close();
			}
}
