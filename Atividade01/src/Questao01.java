import java.util.Locale;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//Ler duas notas e apresentar a m�dia final
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1� nota:");
		float notaUm = scan.nextFloat(); 
		
		System.out.println("Digite a 2� nota:");
		float notaDois = scan.nextFloat();
		
		float media = (notaUm + notaDois) /2;
		System.out.println(String.format("A m�dia final � : %.2f", media));
		
		
		
		
		scan.close();
		
		
		
	}

}
