package LacosCondicionaispack;
import java.util.Scanner;

public class Exercicio3LCIf {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double idade;
		String nome;
		boolean doador;
	
	    
	    System.out.println("Entre com com o seu nome: ");
		 nome= read.nextLine();
		 System.out.println("Entre com com a sua idade: ");
		 idade= read.nextDouble();
		 System.out.println("Responda true(Verdadeiro) ou false (Falso): É a sua primeira doação ");
		doador= read.nextBoolean();
		
		
		

	}

}
