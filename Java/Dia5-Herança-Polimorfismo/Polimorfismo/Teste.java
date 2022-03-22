package Polimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro a = new Cachorro("AUAU",15);
		Cavalo b = new Cavalo("FruFru", 3);
		Preguica c = new Preguica("Eu", 23);
		
		
		System.out.println(a.getNome());
		a.Som();
		System.out.println(b.getNome());
		b.Som();
		System.out.println(c.getNome());
		c.Som();
	}
}
