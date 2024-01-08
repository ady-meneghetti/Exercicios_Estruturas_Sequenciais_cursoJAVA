package pacote.Exercicios_Estrutura_Sequencial_cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		Double HorasTrabalhadas, ValorHora, salario;
		int id;
		System.out.println("Informe o id do funcionario:");
		id= teclado.nextInt();
		
		System.out.println("Total de horas trabalhadas: ");
		HorasTrabalhadas= teclado.nextDouble();
		
		System.out.println("Valor que recebe por hora: ");
		ValorHora= teclado.nextDouble();
		
		salario= (ValorHora * HorasTrabalhadas);
		
		System.out.println ("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		

	}

}
