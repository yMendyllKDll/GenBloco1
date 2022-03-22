package Polimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void Som() {
		System.out.println("Latindo...");
	}

	@Override
	public void mover() {
		System.out.println("Correndo...");	
	}
}
