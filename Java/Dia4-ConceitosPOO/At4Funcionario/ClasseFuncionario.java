package At4Funcionario;

public class ClasseFuncionario {
			
	// Declaração de variaveias

			private int pis;
			private double salario;
			private String nome;
			private int dependentes;

			// criar o meu método especial construtor

			public ClasseFuncionario(int pis, double salario, String nome, int dependentes) {

				this.pis = pis;
				this.salario = salario;
				this.nome = nome;
				this.dependentes = dependentes;
			}

			// declaração dos demais métodos da classe

			public void imprimirInfo() {
				System.out.println("-------- Informações do Funcionario --------");
				System.out.println("Número do pis: " + pis + "\nSálario do Funcionario: " + salario + "\nNome do Funcionario: " + nome
						+ "\nNúmeros de dependentes: " + dependentes);

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
