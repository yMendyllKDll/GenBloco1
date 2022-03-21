package At7Paciente;

public class ClassePaciente {
	
	// Declara��o de variaveias

		private String nome;
		private int idade;
		private String sintoma;
		private String alergia;

		// criar o meu m�todo especial construtor

		public ClassePaciente(String nome, int idade, String sintoma, String alergia) {

			this.nome = nome;
			this.idade = idade;
			this.sintoma = sintoma;
			this.alergia = alergia;
		}

		// declara��o dos demais m�todos da classe

		public void imprimirInfo() {
			System.out.println("-------- Informa��es do Paciente --------");
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSintoma : " + sintoma
					+ "\nAlergia? " + alergia);

		}

		public String getnome() {
			return nome;
		}

		public void setnome(String nome) {
			this.nome = nome;
		}

		public int getidade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSintoma() {
			return sintoma;
		}

		public void setSintoma(String sintoma) {
			this.sintoma = sintoma;
		}

		public String getAlergia() {
			return alergia;
		}

		public void setvalor(String alergia) {
			this.alergia = alergia;
		}
}