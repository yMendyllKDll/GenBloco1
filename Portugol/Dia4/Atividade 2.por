/*
 	2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

programa
{
	
	funcao inicio()
	{
	inteiro vet [10]
	real m = 0.00
	inteiro cont =0
	inteiro maiorNumero = 0

	para(inteiro x=0; x<10; x++){
		escreva("Digite o valor do dado ", ": ")
		leia(vet[x])
		m = m + vet[x]
		
		se(maiorNumero < vet[x]){
			maiorNumero = vet[x]
			cont = 1
		}
		
		senao se(maiorNumero == vet[x]){
			cont++
		}
	}
	m = m/10
	escreva("\nMédia: ", m)	
	escreva("\nMaior número: ", maiorNumero, " apareceu ", cont, " vezes.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 13, 6, 1}-{cont, 14, 9, 4}-{maiorNumero, 15, 9, 11}-{x, 17, 14, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */