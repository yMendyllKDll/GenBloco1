programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro vDistribuidor, vImpostos
		real Fabrica, valorDistribuidor,Imposto,Consumidor

		vDistribuidor = 29
		vImpostos = 47  

		escreva("Informe o valor de custo de fábrica: ")
		leia(Fabrica)  
		
		valorDistribuidor = Fabrica + (Fabrica * vDistribuidor / 100)
		Imposto = Fabrica + (Fabrica * vImpostos / 100)
		Consumidor = Fabrica + valorDistribuidor + Imposto  

		escreva("O custo ao consumidor é: ", Consumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */