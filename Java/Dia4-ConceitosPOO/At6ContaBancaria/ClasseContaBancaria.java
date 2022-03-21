package At6ContaBancaria;

public class ClasseContaBancaria {
	// Declara��o de variaveias

	private int conta;
	private int senha;
	private String nome;
	private double valor;

	// criar o meu m�todo especial construtor

	public ClasseContaBancaria(int conta, int senha, String nome, double valor) {

		this.conta = conta;
		this.senha = senha;
		this.nome = nome;
		this.valor = valor;
	}

	// declara��o dos demais m�todos da classe

	public void imprimirInfo() {
		System.out.println("-------- Informa��es do Funcionario --------");
		System.out.println("N�mero da conta: " + conta + "\nSenha: " + senha + "\nNome : " + nome
				+ "\nValor na conta: R$ " + valor);

	}

	public int getconta() {
		return conta;
	}

	public void setconta(int conta) {
		this.conta = conta;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setvalor(double valor) {
		this.valor = valor;
	}
}
