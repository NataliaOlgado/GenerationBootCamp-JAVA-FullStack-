package atividade.operadores;
import java.util.Scanner;

public class ExercicioOperadores3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Salario Bruto: ");
		double salarioBruto = leia.nextDouble();

		System.out.println("Digite seu Adicional Noturno: ");
		double adicionalNoturno = leia.nextDouble();
		
		System.out.println("Digite suas Horas Extras: ");
		double horaExtra = leia.nextDouble();
		
		System.out.println("Digite seu Desconto: ");
		double desconto = leia.nextDouble();
		
		
		double salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra*5) - desconto; 
		System.out.println("Digite seu Salario Líquido: " +salarioLiquido);
		
		leia.close();
		

		
		
	}

}
