import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		System.out.println("Digite o n�mero da turma:");
		Scanner meuScanner = new Scanner(System.in); // 
		String turma = meuScanner.nextLine(); //Leitura dos dados digitados
		System.out.println("A turma digitada foi: " + turma);
		
		System.out.println("Digite sua Idade: ");
		int idade = meuScanner.nextInt();
		System.out.println("Idade = " + idade);
		
		
		
		meuScanner.close();
	}

}
