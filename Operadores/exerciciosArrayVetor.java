package atividade.operadores;
import java.util.Scanner;

public class exerciciosArrayVetor {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int vetorInt[] = {2,5,1,3,4,9,7,8,10,6};
		int posicao = -1;
		int numero;
		System.out.println("\n Entre com a posição : ");
		numero = read.nextInt();
	
		for (int contador = 0; contador <= vetorInt.length;contador++) {
			if (vetorInt [contador] == posicao ) {
				posicao = contador;
			}
				
				
			}
			
		if (posicao != -1) {
			
			System.out.println("\n O número  " +numero+ "esta lozalizado : "  );
		} else {
			System.out.println("\n O numero não foi encontrado: "  );
			
	
			
			
			
			
			
		
			
			
			

			}
			
			
			
		}
		
		
				
		
	}
	


