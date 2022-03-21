package At4Funcionario;

public class ClasseFuncionario {
			
	// Declara��o de variaveias

			private int pis;
			private double salario;
			private String nome;
			private int dependentes;

			// criar o meu m�todo especial construtor

			public ClasseFuncionario(int pis, double salario, String nome, int dependentes) {

				this.pis = pis;
				this.salario = salario;
				this.nome = nome;
				this.dependentes = dependentes;
			}

			// declara��o dos demais m�todos da classe

			public void imprimirInfo() {
				System.out.println("-------- Informa��es do Funcionario --------");
				System.out.println("N�mero do pis: " + pis + "\nS�lario do Funcionario: " + salario + "\nNome do Funcionario: " + nome
						+ "\nN�meros de dependentes: " + dependentes);

			}

			public int getPis() {
				return pis;
			}

			public void setPis(int pis) {
				this.pis = pis;
			}

			public double getSalario() {
				return salario;
			}

			public void setSalario(double salario) {
				this.salario = salario;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getdependentes() {
				return dependentes;
			}

			public void setDependentes(int dependentes) {
				this.dependentes = dependentes;
			}

				
}
