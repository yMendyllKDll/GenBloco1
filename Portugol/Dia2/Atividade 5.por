/*
 	5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real i

		escreva("índice de poluição: ")
		leia(i)
		se (i >= 0.05 e  i <= 0.25) {
			escreva("\n Dentro dos padrões ")}
		senao se (i > 0.25 e i < 0.4){
		escreva("\n Empresas do grupo 1 devem suspender as atividades")}
		senao se(i >= 0.4 e i <0.5){
		escreva("\n Empresas do grupo 1 e 2 devem suspender as atividades")}
		senao se (i >= 0.5){
		escreva("\n Empresas de todos os grupos devem suspender as atividades")}
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */