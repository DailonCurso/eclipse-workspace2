import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//Ler duas notas e apresentar a média final
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota:");
		float notaUm = scan.nextFloat(); 
		
		System.out.println("Digite a 2ª nota:");
		float notaDois = scan.nextFloat();
		
		float media = (notaUm + notaDois) /2;
		System.out.println(String.format("A média final é : %.2f", media));
		
		
		
		
		scan.close();
		
		
		
	}

}
