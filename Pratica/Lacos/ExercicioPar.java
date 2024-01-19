package ExerciciosdePratica;

import java.util.Scanner;

public class ExercicioPar {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double valor;

		System.out.println(" \n Digite um valor:");
		valor = read.nextDouble();

		if (valor % 2 == 0 && valor >= 0) {

			System.out.println("\n Este número é par e positivo! ");

		} else if (valor % 2 == 0 && valor < 0) {
			System.out.println(" \n Este número é par e negativo! ");
		}

		else if (valor % 2 != 0 && valor > 0) {
			System.out.println(" \n Este número é impar e positivo");
		}

		else {
			System.out.println("\n Esse  número é impar e negativo! ");

		}

	}

}
