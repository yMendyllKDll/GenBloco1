/*
 	3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
	  Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
    		real n1, n2, n3, n4, quad1, quad2, quad3, quad4

  		escreva("Digite um número: ")
  		leia(n1)
  		escreva("Digite mais um número: ")
  		leia(n2)
  		escreva("Digite mais um número: ")
  		leia(n3)
  		escreva("Digite mais um número: ")
  		leia(n4)

		quad1 = mat.potencia(n1, 2.0)
		quad2 = mat.potencia(n2, 2.0)
		quad3 = mat.potencia(n3, 2.0)
		quad4 = mat.potencia(n4, 2.0)

  		se (quad3 >= 1000){
   		escreva("\n O valor do quadrado do 3 número é ", quad3)}
   		
  		senao
    		escreva("\nO quadrado de ", n1, " é igual ", quad1)
   		escreva("\nO quadrado de ", n2, " é igual ", quad2)
   		escreva("\nO quadrado de ", n3, " é igual ", quad3)
    		escreva("\nO quadrado de ", n4, " é igual ", quad4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */