/*
  	1) Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], n=0
		

		para (inteiro x=0;x<5;x++)
		{
			escreva("Digite um numero: ")
			leia(vetor[x])
		}
		para (inteiro x=0; x<5; x++){
			escreva(" " ,vetor[x])
			
			se (n<vetor[x]){
				n=vetor[x]
				
			}
		}
		escreva("\n A maior pontuação do vetor é: ", n)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */