package cursoUdemyPrimeiraAula;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println("Bom diaa");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // Imprime formatado definido quantas casas decimais devem ser exibidas.
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " Metros!");
		System.out.printf("Resultado = %.2f  Metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
