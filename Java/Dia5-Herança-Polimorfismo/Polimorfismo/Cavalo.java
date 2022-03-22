package Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void Som() {
		System.out.println("Relinchando...");
	}

	@Override
	public void mover() {
		System.out.println("Correndo...");
	}
	
}