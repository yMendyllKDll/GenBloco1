package Lista1;

import java.util.Scanner;

public class Atividade2FOR {
		public static void main(String[] args) {
		
			Scanner ler = new Scanner (System.in);
			
			int n = 0,par = 0, impar = 0,y=1;
			
			System.out.println(" Insira 10 n�meros: ");
			
			for(int x = 1;x<=10;x++) {

					System.out.println(y+++" N�mero:");
					n=ler.nextInt();
					if (n%2==0) {
						par++;
					}
					else if (n !=0){
						impar++;
					}

			}
			
			System.out.println("N�meros pares: "+par);
			System.out.println("N�meros pares: "+impar);
			
			ler.close();
	}
}