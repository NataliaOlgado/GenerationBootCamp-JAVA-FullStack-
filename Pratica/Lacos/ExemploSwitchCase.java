package LacosCondicionaispack;
import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int op;
		
		System.out.println("\n\t\t Meuno de Emoções");
		System.out.println("\n 1- Gratidão");
		System.out.println("\n 2- Amor");
		System.out.println("\n 3- Felicidade ");
		System.out.println("\n 4- Contentamento ");
		System.out.println("\n 5- Orgulho ");
		System.out.println("\n Digite a sua opção");
		op = read.nextInt();
		
		switch(op) {
		case 1: 
			System.out.println("\n Sentimento de Gratidão");
			break;
		
		case 2:
			System.out.println("\n Sentimento de Amor");
			break;
			
		case 3:
			System.out.println("\n Sentimento de Felicidade");
			break;
			
		case 4:
			System.out.println("\n Sentimento de Contentamento");
			break;
			
		case 5:
			System.out.println("\n Sentimento de Orgulho");
			break;
			
			default: 
				System.out.println("\n Opção Invalida");
				
				read.close();
				
		}
	}

}
