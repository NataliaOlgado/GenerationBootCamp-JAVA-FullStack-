package atividade.operadores;

import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		
		int vetorInt[][] ={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("\n Elementos da Diagonal Principal: ");
		for (i = 0; i <3 ; i++) {
			System.out.println(vetorInt[i][i] + " ") ;
			
		}
			
		System.out.println("\n Elementos da Diagonal Secundária: ");
		for (i = 0; i <3 ; i++) {
			System.out.println(vetorInt[i][2 - i] + " ");
			
		}
		
		int somaDioganalPrincipal = 0;
		for (i = 0; i <3 ; i++) {
			somaDioganalPrincipal += vetorInt[i][i]; 
			System.out.println("\n Elementos da Diagonal Principal:  " + somaDioganalPrincipal);
			
			int somaDioganalSecundaria = 0;
			for (i = 0; i <3 ; i++) {
				somaDioganalSecundaria += vetorInt[i][2 - i];
				System.out.println("\n Elementos da Diagonal Secundária: " + somaDioganalSecundaria);
			}
		}
			
		read.close();
	}

}
