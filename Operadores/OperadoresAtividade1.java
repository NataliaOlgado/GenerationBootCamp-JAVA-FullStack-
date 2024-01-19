package atividade.operadores;
import java.util.Scanner;

public class OperadoresAtividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite Salario: ");
		double salario = leia.nextDouble();
		
		System.out.println("Digite Abono: ");
		double abono = leia.nextDouble();
		
		double novoSalario = salario+abono; 
		
		System.out.println("Novo Salário: " +novoSalario);
		
leia.close();
	}

}
