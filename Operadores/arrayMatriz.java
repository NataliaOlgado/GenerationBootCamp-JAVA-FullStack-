package atividade.operadores;

import java.util.Scanner;

public class arrayMatriz {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numeros[][] = new int [3] [2];
		int contPares=0, somaImpar = 0, linha,coluna;
		
		
		for (linha=0;linha<3;linha++) {
		for (coluna=0;coluna<2;coluna++) {
			System.out.println("\n Entre com um numero na linha   " +linha+ "coluna: " +coluna);
			numeros[linha][coluna] =read.nextInt();
			
			if ( numeros[linha][coluna]% 2==0) {
				contPares++;
			}else {
				somaImpar += numeros[linha][coluna];
			}
			
		}
		
		}
		System.out.println("\n Eu tenho: "+contPares+ " numeros pares....)");
		System.out.println("\n Somatorio do números impares: " +somaImpar);
		

	}

}
