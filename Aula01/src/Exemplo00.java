import java.util.Locale;
import java.util.Scanner;

public class Exemplo00 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Aulas de Java turma QUA209047");
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String name = sc.next();
		
		System.out.println("Digite a Idade:");
		int age = sc.nextInt();
		
		float altura = 1.73f;
		double balance = 289945.76;

		System.out.println("Ent?o, " + name + ".\n Voc? tem " + age + " anos, sua altura ? " + altura + " e seu saldo ?: " + balance);
*/		

		// CPF ? uma boa pr?tica se escrever/armazenar em Sring
		// sc.close();
		
		//Variables
		String name = "Luis Felipe";
		int idade = 34;
		float altura = 1.73f;
		char sexo = 'M';
		
		//Sa?da dos dados
		System.out.println("Dados da Pessoa: " +name);
		System.out.println("Idade = " + idade);
		System.out.println("Altura = " + altura);
		System.out.println("Sexo = " + sexo);
		
	}

}
