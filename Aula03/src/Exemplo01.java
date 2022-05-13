
public class Exemplo01 {

	public static void main(String[] args) {
		String nome = "Luiz Felipe";
		String cpf = "000.032.651-24";
		String nacionalidade ="Brasileiro(a)";
		String cidade = "Brasília";
		String endereco = " QNL \"3\", Quadra \"8\", Lote \"23\", Taguatinga-DF.";
		
		
		String declaracao = String.format("Eu %s, portador do CPF: %s, %s residente e domiciliado em %s, no endereço: %s", nome, cpf, nacionalidade, cidade, endereco);
		
		System.out.println(declaracao);
	}

}
