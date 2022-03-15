package Lista1;

import java.util.Scanner;

public class Atividade8 {
	
			public static void main(String[] args) {
			
				Scanner ler = new Scanner(System.in);
				double custoConsumidor, custoFabrica, distribuidor, imposto;
			
				System.out.print("Qual o custo de fábrica do carro? R$ ");
				custoFabrica = ler.nextDouble();
			
				distribuidor = 0.28*custoFabrica;
				imposto = 0.45*custoFabrica;
				custoConsumidor = custoFabrica + distribuidor + imposto;
			
				System.out.print("O custo do carro ao consumidor é R$ "+custoConsumidor);
				
				ler.close();
			}
}
