package br.com.chain.model;

public abstract class Banco {
	protected Banco successor;
	protected int codigo;
	
	
	//Constructor
	public Banco(int codigo) {
		this.codigo = codigo;
	}
	
	//Method
	public void setSuccessor(Banco successor) {
		this.successor = successor;
	}
	
	public abstract void aprova(int numero) throws Exception;
}
