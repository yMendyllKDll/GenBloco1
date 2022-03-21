package At3ProdutoEletronico;

public class ClasseProdutoEletronico {
	
	// Declaração de variaveias

		private String marca;
		private String modelo;
		private String nomeCliente;
		private String problema;

		// criar o meu método especial construtor

		public ClasseProdutoEletronico(String marca, String modelo, String nomeCliente, String problema) {

			this.marca = marca;
			this.modelo = modelo;
			this.nomeCliente = nomeCliente;
			this.problema = problema;
		}

		// declaração dos demais métodos da classe

		public void imprimirInfo() {
			System.out.println("-------- Assitencia Tecnica --------");
			System.out.println("Equipamento marca: " + marca + " modelo: " + modelo + " do cliente: " + nomeCliente
					+ "\nestá com o problema descrito a seguir: " + problema);

		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getProblema() {
			return problema;
		}

		public void setProblema(String problema) {
			this.problema = problema;
		}

	}
