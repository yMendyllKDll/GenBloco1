package ArrayList;
import java.util.ArrayList;
import java.util.List;;

public class Estoque {
	public static void main(String[] args) {
		
		List<String> itens = new ArrayList<>();//Criação da lista
		//Adiciona a lista
		itens.add("Computador");               
        itens.add("Mouse");
        itens.add("teclado");
        itens.add("HeadSet");
        itens.add("MousePad");

        itens.remove(2);               //Remove da lista
        itens.add(2, "Monitor");      //Atualiza a lista
        System.out.println(itens);   //Apresenta a lista completa
	}
}
