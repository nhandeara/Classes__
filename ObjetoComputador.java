package Classes__;

public class ObjetoComputador {

	public static void main(String[] args) {
	Computador Computador1 = new Computador();
	//OBJETO 1
	Computador1.setCor("preto");
	Computador1.setModelo("xxxxxxxx");
	Computador1.setMaterial("xxxxxx");

	
	//Chamando o método get() para apresentar os objetos
	System.out.println("----Computador1----");
	System.out.println(Computador1.getCor());
	System.out.println(Computador1.getModelo());
	System.out.println(Computador1.getMaterial());
	System.out.println(Computador1.getDesligar());
	System.out.println(Computador1.getLigar());
	}
}

