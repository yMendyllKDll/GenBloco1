package At6ContaBancaria;

public class ClasseContaBancaria {
	// Declaração de variaveias

	private int conta;
	private int senha;
	private String nome;
	private double valor;

	// criar o meu método especial construtor

	public ClasseContaBancaria(int conta, int senha, String nome, double valor) {

		this.conta = conta;
		this.senha = senha;
		this.nome = nome;
		this.valor = valor;
	}

	// declaração dos demais métodos da classe

	public void imprimirInfo() {
		System.out.println("-------- Informações do Funcionario --------");
		System.out.println("Número da conta: " + conta + "\nSenha: " + senha + "\nNome : " + nome
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
