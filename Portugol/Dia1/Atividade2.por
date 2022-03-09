programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro ano,mes,dia,confia
		
		escreva("Escreva sua idade em dias: ")
		leia(confia)
		ano = confia /365
		mes = (confia%365)/30
		dia = (confia%365)%30
		escreva("\nSua idade em anos é: ",ano)
		escreva("\nSua idade em meses é: ",mes)
		escreva("\nSua idade em dias é: ",dia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */