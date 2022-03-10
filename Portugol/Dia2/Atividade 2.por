/*
 	2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

programa
{
	
	funcao inicio()
	{
		inteiro C,N,E,S,EX

		escreva("Digite as horas trabalhadas: ")
		leia(N)
		escreva("Digite o Código do trabalhador: ")
		leia(C)

		se  (N > 50) {
		E   = N - 50
		EX = E * 20
		S = 50 * 10
		escreva("Código do trabalhador: ",C)
		escreva ("\n Salario Total: ", S,(" Reais "))
		escreva ("\n Hora Extra: ", E,(" Horas "))
		escreva ("\n Salario Extra: ", EX,(" Reais "))}

		senao{
		E = 0
		S = N*10
		escreva("Código do trabalhador: ",C)
		escreva ("\n Salario Total: ", S,(" Reais"))
		escreva ("\n Salario Extra: ", E,(" Reais"))}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 917; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */