package aulaJPA.aula01;

import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		// Variáveis
		double a, b, mul;
		// Instaciar Classe Scanner
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();

		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();

		// Processamento
		mul = a * b;
		// Sáida
		System.out.println("O resultado é : " + mul);

	}

}
