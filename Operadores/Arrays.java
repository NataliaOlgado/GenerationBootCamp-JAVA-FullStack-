package atividade.operadores;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float media[] = new float [4];
		String nomes [] = new String [4];
		float n1,n2,n3,mediaGeral,somaMedia=0;
		int x;
		
		
		for (x=0;x<4;x++) {
			
			System.out.println("\n Entre com a primeira nota: ");
			n1 = read.nextFloat();
			System.out.println("\n Entre com a segunda nota: ");
			n2 = read.nextFloat();
			System.out.println("\n Entre com a terceira nota: ");
			n3 = read.nextFloat();
			
			
			media[x]= (n1+n2+n3)/3;
			
			System.out.println("\n Média aluno do " +(x+1)+ " foi de : " +media[x]);
			
			somaMedia += media[x];
			
		}
		
		mediaGeral= somaMedia/x;
		
		System.out.println("Media geral foi de: " +mediaGeral);
		
		for (x=0;x<4;x++) {
			System.out.println("\n Média aluno do " +(x+1)+ " foi de : " +media[x]);
		}
		
	}

}
