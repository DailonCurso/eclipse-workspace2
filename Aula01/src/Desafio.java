import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US); //
		Scanner scn = new Scanner(System.in);
		scn.useLocale(Locale.US); // Solu??o que se aplica apenas ao scanner (mais pontual)
		
		//Variaveis
		char sexo;
		
		//Scanners de campos
		System.out.print("Digite seu nome: ");
		String name = scn.next();
		
		System.out.print("Digite sua idade: ");
		int idade = scn.nextInt();
		
		System.out.print("Digite sua altura: ");
		float altura = scn.nextFloat();
		
		System.out.println("Digite seu sexo");
		String sexu = scn.next();
		
		if (sexu != null) {
			if(sexu.equals("Homem") || sexu.equals("homem") || sexu.equals("Masculino") || sexu.equals("masculino") || sexu.equals("m") || sexu.equals("M") || sexu.equals("H") || sexu.equals("h")) {
				sexo = 'M';
			}else if(sexu.equals("mulher") || sexu.equals("Mulher") || sexu.equals("Feminino") || sexu.equals("feminino") || sexu.equals("f") || sexu.equals("F")) {
				sexo = 'F';
			}else {
				sexo = 'O';
			}
		}else {
			System.out.println("Digite seu sexo");
			sexo = scn.next().charAt(0);
		}
		
		
		
		
		
		//Saida de dados
		System.out.println("Aulas de Java turma QUA209");
		System.out.println("Nome = " + name);
		System.out.println("Idade = " + idade);
		System.out.println("Altura = " + altura);
		System.out.println("Sexo = " + sexo);
		
		scn.close();
	}
	

}
