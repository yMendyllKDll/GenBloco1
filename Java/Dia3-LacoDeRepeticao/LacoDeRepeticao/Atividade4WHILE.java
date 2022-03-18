package Lista1;

import java.util.Scanner;

public class Atividade4WHILE {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		char sexo,opcao,continua=' ';
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0,
			pessoasN=0, pessoasC=0,idade=0,pessoas=150,cont=1;
		
		while(cont<=pessoas) {
			System.out.println("Forneça sua idade");
			idade = ler.nextInt();
			System.out.println("Forneça 1-Feminino, 2-Masculino, 3-Outros");
			sexo = ler.next().charAt(0);
			System.out.println("Forneça se você é uma pessoa 1-Calma, 2-Nervoso, 3-Agressivo ");
			opcao = ler.next().charAt(0);
			
			if(opcao =='1') {
				pessoasCalmas++;
			}
			if(sexo=='1' && opcao =='2') {
				mulheresNervosas++;
			}
			if(sexo=='2' && opcao =='3') {
				homensAgressivos++;
			}
			if(sexo=='3' && opcao =='1') {
				outrosCalmos++;
			}
			if(opcao =='2' && idade>=40) {
				pessoasN++;
			}
			if(opcao =='1' && idade<18) {
				pessoasC++;
			}
			if(cont != pessoas) {
				System.out.println("Deseja continuar ? s - para SIM || n - para NÃO ");
				continua = ler.next().charAt(0);
				if(continua=='n') {
					System.out.println(" Programa Finalizado ");
					break;
				}
			}
			cont++;
			
		}
		
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres Nervosas: "+mulheresNervosas);
		System.out.println("Homens Agressivos: "+homensAgressivos);
		System.out.println("Outros Calmos: "+outrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+pessoasN);
		System.out.println("Pessoas Calmas com menos de 18 anos: "+pessoasC);
		ler.close();
	}
	

}
