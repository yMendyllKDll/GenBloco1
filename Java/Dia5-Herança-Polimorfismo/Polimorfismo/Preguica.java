package Polimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void Som() {
		System.out.println("zZzZzZzZ");	
	}

	@Override
	public void mover() {
		System.out.println("Subindo na árvore");		
	}
}
