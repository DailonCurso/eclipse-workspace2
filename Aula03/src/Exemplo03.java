import java.util.Locale;
import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// Variaveis
		float n1, n2, n3;

		// Entrada e dados
		System.out.println("Digite 1 numero:");
		n1 = scan.nextInt();

		System.out.println("Digite 1 numero");
		n2 = scan.nextInt();
		
		System.out.println("Digite 1 numero");
		n3 = scan.nextInt();
		
		String mensagem ="";
		if(n1 >= n2 && n1 >= n3) {
			System.out.println(String.format("O %.2f � o maior.", n1));
		}else if(n2 >= n1 && n2 >= n3) {
			System.out.println(String.format("O %.2f � o maior.", n2));
		}else if(n1 == n2 && n1 == n3) {
			System.out.println(String.format("%.2f - S�o iguais.", n1));
		}else {
			System.out.println(String.format("O %.2f � o maior.", n3));
		}
		
		
		
		
		scan.close();

	}

}
