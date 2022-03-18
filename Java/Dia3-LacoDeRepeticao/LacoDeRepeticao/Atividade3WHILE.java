package Lista1;

import java.util.Scanner;

public class Atividade3WHILE {
			
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int idade = 0,Cont21=0,Cont50=0;
			
			while(idade != -99) {
				System.out.println("Insira idade: ");
				idade = ler.nextInt();
				
				if(idade<21 && idade>0) {
					Cont21++;
				}
				else if(idade>50) {
					Cont50++;
				}
			}
			System.out.println("Pessoas com 21: "+Cont21);
			System.out.println("Pessoas com 50: "+Cont50);
			ler.close();
		}
}
