package LacosCondicionaispack;
import java.util.Scanner;

public class ExercicioLCSW2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float salario;
		String nome;
		int cargo;
		
	System.out.println("\n\t \t Planilha de Ajutes ");
	System.out.println("\n 1- \t Gerente");
	System.out.println("\n 2- \t Vendedor");
	System.out.println("\n 3- \t Supervisor");
	System.out.println("\n 4- \t Motorista");
	System.out.println("\n 5- \t Estoquista");
	System.out.println("\n 6- \t Tecnico de TI");
	System.out.println("\n Digite o código do seu cargo: ");
	cargo = read.nextInt();
	System.out.println("\n Digite seu nome ");
	nome = read.nextLine();
	System.out.println("\n Digite o salario");
	salario= read.nextFloat();
	
	
	switch(cargo) {
	case 1: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Gerente  Salario reajustado : " +(salario*1.10));
		break;
		
	case 2: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Vendedor  Salario reajustado : " +(salario*1.07));
		break;
	
	case 3: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Supervisor  Salario reajustado : " +(salario*1.09));
		break;
		
	case 4: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Motorista  Salario reajustado : " +(salario*1.06));
		break;
		
	case 5: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Estoquista  Salario reajustado : " +(salario*1.05));
		break;
		
	case 6: 
		System.out.println("\n Nome do Colaborador:  " +nome+ "  Cargo: Técnico de TI  Salario reajustado : " +(salario*1.08));
		break;
		
		default: 
			System.out.println("\n Opção Invalida");
			
			read.close();
		
	}
		

	}

}
