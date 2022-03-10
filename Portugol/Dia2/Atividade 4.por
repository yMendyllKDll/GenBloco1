/*
 	4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro num
			
		escreva("Digite o número: ")
		leia(num)
		
		se (num % 2==0){
		escreva("\n O número é par")}
		
		senao{
		escreva("\n O número é impar")}

		se (num >= 0){
		escreva("\n O número é positivo")}
		senao{
		escreva("\nO número é negativo")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */