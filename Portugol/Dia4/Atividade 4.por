/*
 	4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

programa
{
	
	funcao inicio()
	{
		inteiro matriz [3][3]
 		inteiro totalDiagonal = 0
 		inteiro soma = 0

 	para(inteiro linha=0; linha <3; linha++){
 		para(inteiro coluna = 0; coluna <3; coluna ++){
 			escreva("Digite o valor da linha ", linha, " coluna ", coluna, ": ")
 			leia(matriz[linha][coluna])
 			soma= soma + matriz[linha][coluna]
 				se(linha==coluna){
 					totalDiagonal = totalDiagonal + matriz[linha][coluna]
 				}
 		}
 	}
 	para(inteiro linha=0; linha<3; linha++){
 		para(inteiro coluna=0; coluna<3;coluna++){
 		escreva(matriz[linha][coluna], " ")
 	}
	}
	escreva("\nTotal: ",soma)
	escreva("\nValor da diagonal principal: ", totalDiagonal)
	escreva("\nFim do programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */