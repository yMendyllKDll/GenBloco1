package Lista1;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Qual sua idade? ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("Categoria Infatil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.print("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.print("Categoria Adulto");
		}
		else {
			System.out.print("Idade fora das categorias");
		}
		ler.close();
	}

}
