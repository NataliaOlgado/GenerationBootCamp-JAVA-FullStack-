package atividade.operadores;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		
		System.out.println("Digite sua nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite sua nota 2: ");
		float nota2 = leia.nextFloat();
	
		System.out.println("Digite sua nota 3: ");
		float  nota3 = leia.nextFloat();
		
		System.out.println("Digite sua nota 4: ");
		float nota4 = leia.nextFloat();
		
		float mediaFinal = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Nota final: " + mediaFinal);
		
		leia.close();
		
	}

}
