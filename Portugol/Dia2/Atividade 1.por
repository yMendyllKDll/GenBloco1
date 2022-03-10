/* 
	1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro limi = 50
		real m,E,p
		
		escreva("Digite a quantidade de quilos: ")
		leia(p)
		se( p <= limi){
			E=0.0
			m=0.0
			escreva("\nA quantidade de quilos que joão trouxe foi de: ",p,"\nAquantidade a mais que joão trouxe foi de: ",E,
			"João tem uma multa de: ",m)}
		senao{
    		E = p-limi
    		m = E * 4
    		escreva("A multa que joão tomou foi de ",m," reais")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 972; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */