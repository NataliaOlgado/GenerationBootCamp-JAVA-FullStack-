package ExerciciosdePratica;
import java.util.Scanner;


public class ExerciciosdePraticaIfElseFor {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println(" \n Digite um valor até 1 a 10");
		int n1 = read.nextInt();
		
		
		System.out.println(" \n Digite um valor até 1 a 10");
		int n2 = read.nextInt();
		
		
		System.out.println(" \n Digite um valor até 1 a 10");
		int n3 = read.nextInt();
	
		int somadosvalores = n1+n2;
		
		
		if (somadosvalores > n3) {
			
		System.out.println("\n A Soma dos valores A e B é  " + somadosvalores + " é Maior do que : " + n3);
			
		}
		else if (somadosvalores < n3) {
			System.out.println(" \"A Soma dos valores A e B é " + somadosvalores + " é Menor do que : " + n3);
			
			}
		else if (somadosvalores == n3) {
			System.out.println(" \"A Soma dos valores A e B é  " + somadosvalores + " que é Igual a : " + n3);
			
		}

	}

}
