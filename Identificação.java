package aulaJPA.aula01;

import java.util.Scanner;

public class Identificação {

	public static void main(String[] args) {
		String nome;
		// Variáveis
		int idade;
		String identidade;
		// Instaciar Classe Scanner
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe seu nome : ");
		nome = ler.next();

		System.out.println("Informe sua idade : ");
		idade = (int) ler.nextDouble();

		// Processamento
		identidade = nome+", "+idade;
		// Sáida
		System.out.println("Você é : " + identidade);

	}

}
