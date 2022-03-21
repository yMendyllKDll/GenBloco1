package At1Cliente;

public class ClasseCliente {

	private double pagamento;
	private String status;
	private String nome;
	private int cpf;
	
	public ClasseCliente(double pagamento, String status, String nome, int cpf) {

		this.pagamento = pagamento;
		this.status = status;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void imprimirInfo() {
		System.out.println("-------- INFORMAÇÕES --------");
		System.out.println("Nome Cliente: " + nome + "\nCPF: " + cpf + "\nValor Pago : R$ " + pagamento
				+ "\nStatus: " + status);

	}


public String nome() {
	return nome;
}

public void nome(String nome) {
	this.nome = nome;
}

public int cpf() {
	return cpf;
}
public void cpf(int cpf) {
	this.cpf = cpf;
}

public void pagamento(double pagamento) {
	this.pagamento = pagamento;
}

public double pagamento() {
	return pagamento;
}

public void status(String status) {
	this.status = status;
}

public String status() {
	return status;
}


}


