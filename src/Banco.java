import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<Conta> contas;
	private String endereco;
	private String nome;
	private String telefone;
	
	public Banco(String endereco, String nome, String telefone) {
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

}

//Checar se a exibição de contas e clientes funciona.
