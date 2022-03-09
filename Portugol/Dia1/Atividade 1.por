programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro confia,mes,dias,resul
		
		escreva("Escreva sua idade em anos: ")
		leia(confia)
		escreva("Escreva sua idade em meses: ")
		leia(mes)
		escreva ("Escreva sua idade em dias: ")
		leia(dias)
		resul = confia*365 + mes*30 + dias
		escreva("Sua idade em dias é: ", confia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */