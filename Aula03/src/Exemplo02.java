import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// Variaveis
		int n1, n2;
	

		// Entrada e dados
		System.out.println("Digite 1 numero:");
		n1 = scan.nextInt();

		System.out.println("Digite 1 numero");
		n2 = scan.nextInt();

		
		
		String mensagem = "";
		
		/*
		//Solu��o 01
		
		int maior = Math.max(n1, n2);
		System.out.println(String.format("O n�mero %.2f � o maior", maior));
		
		*/
		
		
		//Solu��o 02
		
		if(n1 > n2) {
			System.out.println(String.format("O n�mero %s � o maior", n1));
		}else if (n1 < n2) {
			System.out.println(String.format("O n�mero %s � o maior", n2));
		}else {
			System.out.println(String.format("O n�mero %s n�meros iguais", n2));
		}
		System.out.println(mensagem);
		
		
		
		
		
		scan.close();

	}

}
