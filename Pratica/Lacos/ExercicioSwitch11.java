package LacosCondicionaispack;

import java.util.Scanner;
public class ExercicioSwitch1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int op,quantidade,valortotal;
		
	
		System.out.println("\n\t Meuno de Produto");
			System.out.println("\n 1- \t Cachorro Quente \n R$ 10,00");
		System.out.println("\n 2- \t X-Salada  \n R$ 15,00");
		System.out.println("\n 3- \t X-Bacon \n R$ 18,00");
		System.out.println("\n 4- \t Bauru \n R$ 12,00");
		System.out.println("\n 5- \t Refrigerante \n R$ 8,00");
		System.out.println("\n 6- \t Suco de laranja \n R$ 13,00");
		System.out.println("\n Digite a Opção");
		op = read.nextInt();
		System.out.println("\n Digite a Quantidade");
		quantidade= read.nextInt();
		
	
		switch(op) {
		case 1: 
			System.out.println("\n Produto: Cachorro Quente \t Valor total:" + 10*quantidade);
			break;
		
		case 2:
			System.out.println("\n X-salada \t Valor total: " + 15*quantidade);
			break;
			
		case 3:
			System.out.println("\n X- Bacon \t Valor total: " + 18*quantidade);
			break;
			
		case 4:
			System.out.println("\n Bauro  \t Valor total: " + 12*quantidade);
			break;
			
		case 5:
			System.out.println("\n Refrigerante  \t  Valor total:" + 8*quantidade);
			break;
			
		case 6:
			System.out.println("\n Suco de Laranja \t Valor Total: " + 13*quantidade);
			break;
			
			default: 
				System.out.println("\n Opção Invalida");
				
				read.close();		
		}
		
	}


}
