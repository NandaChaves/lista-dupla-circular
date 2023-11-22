
public class ListaDuplaCircular {
  private CaixinhaDupla inicio;
  
  public boolean isEmpty()
  {
	  return (inicio == null);
  }
  public void inserir(int elemento)
  {   CaixinhaDupla novo = new CaixinhaDupla();
	  novo.setElemento(elemento);
	  if(isEmpty())
	  {
		  novo.setProximo(novo);
		  novo.setAnterior(novo);
		  inicio = novo;
	  }else {
		  CaixinhaDupla temp = inicio;
		  while(temp.getProximo()!=inicio)
		  {
			  temp = temp.getProximo();
		  }
		  inicio.setAnterior(novo);//permite imprimir toda a lista
		  temp.setProximo(novo);
		  novo.setAnterior(temp);
		  novo.setProximo(inicio);
	  }  
  }//fim de inserir 
  public void exibirNaOrdem()
  {
	  CaixinhaDupla temp = inicio;
	  do {
		  System.out.println("Elemento da lista " + temp.getElemento());
		  temp = temp.getProximo();
	  }while(temp!=inicio);
  }
  
  public void exibirNaOrdemInversa()
  {
	  CaixinhaDupla temp = inicio;
	  do {
		  System.out.println("Elemento da lista " + temp.getElemento());
		  temp = temp.getAnterior();
	  }while(temp!=inicio);
  }

  public void eliminarElemento(int num)
  {  if(inicio!=null)//se a lista não estiver vazia
	  {
	//se for remover o primeiro
		  if(inicio.getElemento()==num)
		  {
			  this.inicio = this.inicio.getProximo();
		  }else {
			  CaixinhaDupla temp = inicio.getProximo();
			  temp.setAnterior(inicio);
			//percorre a lista
			  while(temp!=null && temp.getElemento()!=num)
			  {
				  temp = temp.getProximo();
			  }
			  //se temp for diferente de null é pq encontrou o elemen
			  if(temp!=null)
			  {
				  temp.getAnterior().setProximo(temp.getProximo());
				  temp.getProximo().setAnterior(temp.getAnterior());
			  }//fim do if
		  }//fim do else
	  }//fim do if
  }//fim do metodo
  
}
