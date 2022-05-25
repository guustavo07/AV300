package questao2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int options=0;
		 String Placa, Cor, Modelo, Fabricante, AnoFab;
		int numPortas;
		double valDiaria;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("1- Cadastrar Utilitário "
				+ "\n2- Cadastrar Motocicleta "
				+ "\n3- Cadastrar Van "
				+ "\n4- Cadastrar Caminhão "
				+ "\n5- Sair");
		options=ler.nextInt();
		switch(options) {
		
		case 1:
			System.out.println("informe a placa: ");
			Placa=ler.next();
			System.out.println("Qual a cor: ");
			Cor=ler.next();
			System.out.println("Qual o modelo: ");
			Modelo=ler.next();
			System.out.println("Qual o fabricante: ");
			Fabricante=ler.next();
			System.out.println("Qual o ano de fabricação: ");
			AnoFab=ler.next();
			System.out.println("Qual o valor da diaria: ");
			valDiaria=ler.nextDouble();
			System.out.println("Qual o numero de portas: ");
			numPortas=ler.nextInt();
			
			
			
		}
	}

}
