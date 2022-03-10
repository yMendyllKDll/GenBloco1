/*
 	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro N
		
		escreva("Coloque um valor para atribuir a N: ")
		leia(N)
		
		se (N >100){
			escreva("\n N é maior que 100 !! \n")}
		
		senao{
			N=0
			escreva("\n N não maior que 100, logo N tem o valor de: ", N)}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */