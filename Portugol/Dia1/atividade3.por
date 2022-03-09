programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro confia, minutos,hora,segundos
		
		escreva("Tempo de duração do evento em segundos: ")
		leia(confia)
		hora = confia /3600
		minutos = (confia%3600)/60
		segundos = (confia%3600)%60
		escreva("O evento Durou aproximadamente ",hora+"Horas\t"+minutos+"Minutos\t"+segundos+("Segundos"))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */