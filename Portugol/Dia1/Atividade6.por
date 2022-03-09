programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1,y1,x2,y2,d,r,s,p,x,y
		
		
		escreva ("valor de x1 ?")
		leia (x1)
		escreva ("valor de x2 ?")
		leia (x2)
		escreva ("valor de y1 ?")
		leia (y1)
		escreva ("valor de y2 ?")
		leia (y2)

		s = x1-x2
		p = y1-y2
		x = mat.potencia(s, 2.0)
		y = mat.potencia(p, 2.0)
		d = x+y
		r = mat.raiz(d, 2.0)
		escreva ("A distância entre os dois pontos eh: ", r)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x1, 7, 7, 2}-{y1, 7, 10, 2}-{x2, 7, 13, 2}-{y2, 7, 16, 2}-{d, 7, 19, 1}-{r, 7, 21, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */