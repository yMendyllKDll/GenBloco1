/*
 	3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{		
			real N=0.0,M=0.0
			inteiro R=0,C=0
			enquanto (N >= 0){
			escreva("\nDigite um valor númerico: ")
			leia(N)
				se(N<=0){
				escreva("\nPrograma encerrado")
				pare
				}
				R=R+N
				C++
			}		
				M=R/C
				escreva("\nSoma: ",R)
				escreva("\nNúmeros digitados: ",C)
				escreva("\nMédia: ",M)
				escreva("\nPrograma encerrado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */