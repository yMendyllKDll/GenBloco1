programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,s,p1,p2,n,m
		
		escreva("\nNúmero 1: ")
		leia(a)
		escreva("\nNúmero 2: ")
		leia(b)
		escreva("\nNúmero 3: ")
		leia(c)

		n = a+b
		m = b+c
		p1 = mat.potencia(n, 2.0)
		p2 = mat.potencia(m, 2.0)
		s = (p1+p2)/2
		escreva("O resultado da expressão é: ",s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {s, 7, 13, 1}-{p1, 7, 15, 2}-{p2, 7, 18, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */