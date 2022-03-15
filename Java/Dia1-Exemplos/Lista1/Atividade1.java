package Lista1;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int  a,m,d,r;
		
		System.out.println ("Escreva quantos anos voce tem: ");
		a = ler.nextInt();
		System.out.println("Escreva quantos meses voce tem: ");
		m = ler.nextInt();
		System.out.println ("Escreva quantos dias: ");
		d = ler.nextInt();

		r=a*365 + m*30 + d;
		
		System.out.println("Você está na terra há: "+ r+ " dias.");
		
		ler.close();
	
	}
}

