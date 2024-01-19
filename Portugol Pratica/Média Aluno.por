programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia mome
		real N1,N2,N3,media
		escreva("Entre com o seu nome")
		leia (nome)	
		escreva( "entre com a primeira nota")
		leia (n1)	
		escreva( "entre com a segunda  nota")
		leia (n2)	
		escreva( "entre com a terceira nota")
		leia (n3)		
		media=(n1+n2+n3)/3
		limpa()
		se (media>= 7.0)
		escreva ("Aluno", nome "parabens vc foi aprovado",mat.arredondar(media,2))
	}
	senao se (media >=4 e media <7)
		escreva("Você está de Exame, com nota "mat.arredondar(media,2))
	{
	}
		senao  
		escreva ("Aluno", nome "vc foi repravado com nota",mat.arredondar(media,2))

{
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */