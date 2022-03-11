programa
{
	
	funcao inicio()
	{
		real salario = 0.00,MediaS = 0.00,TotalS = 0.00,MaiorS = 0.00,P = 0.00,MediaF = 0.00,TotalF = 0.00
		inteiro filhos = 0,contaP = 0
		real C = 20.0


		para(inteiro x=1; x<=C; x++){

			escreva("Habitantes: ", x,"\n")
			escreva("Qual o seu salário? R$ ")
			leia(salario)
			TotalS = TotalS+salario
	
			escreva("Quantos filhos você tem? " )
			leia(filhos)
			TotalF = TotalF + filhos


			se(MaiorS < salario)
			{
				MaiorS = salario
			}
			se(salario <= 100){
				contaP++
			}
		}

		escreva("\nTotal de salarios: R$ ", TotalS)
		escreva("\nTotal de filhos: ",TotalF)
		escreva("\nMaior salário: R$ ", MaiorS)

		P = (contaP / C) * 100
		escreva("\nPessoas que ganham até R$ 100: ", P)

		MediaS = TotalS / C
		MediaF = TotalF / C

		escreva("\nMédia de salários: R$ ", MediaS)
		escreva("\nMédia de filhos: ", MediaF)
			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */