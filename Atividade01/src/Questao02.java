import java.util.Locale;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// Ler um numero, apresentar o anterior e o pr?ximo
		
		Locale.setDefault(Locale.US);
		Scanner scamNum = new Scanner(System.in);
		
		System.out.println("Digite um n?mero:");
		int numero = scamNum.nextInt();
		
		int antes = numero -1;
		int depois = numero +1;
		
		System.out.println(String.format("O n?mero digitado foi %s, seu antecessor ? %s e seu sucessor ? %s.", numero, antes, depois));
		
		
		scamNum.close();
		

	}

}
