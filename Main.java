
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDuplaCircular lista = new ListaDuplaCircular();
		lista.inserir(87);
		lista.inserir(39);
		lista.inserir(99);
		lista.inserir(27);
		lista.inserir(9);
		lista.inserir(71);
		
		lista.exibirNaOrdem();
		System.out.println("-------Ordem inversa---------");
		lista.exibirNaOrdemInversa();
		
		lista.eliminarElemento(71);
		System.out.println("-------Lista sem o 87---------");
		lista.exibirNaOrdem();
	}

}
