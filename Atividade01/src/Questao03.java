import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// Ler um nome e digitar "ol� <nome digitado>
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		
		String nome = scn.nextLine();
		
		System.out.println(String.format("Ol� %s!", nome));
		
		
		scn.close();
	}

}
