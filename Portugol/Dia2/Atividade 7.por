/*
 	7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	
		real base,altura,resul
		
		escreva("\n Digite o valor da base: ")
	    	leia(base)
		escreva("\n Digite o valor da Altura: ")
	    	leia(altura)
	    	
	    se (base>0 e altura>0){
		    resul = (base * altura)/2
		    escreva("\n A área do triangulo é: ",resul)}
		    
	    senao{
		    escreva("\n O Valor colocado não é válido para essa operação, tente novamente com valor diferente !")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 649; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */