package br.com.chain.model;

public class BancoA extends BancoChain {

	public BancoA() {
		super(IDBanco.bancoA); //Inicializa o Id do Banco
	}

	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado pelo BancoA!");	
	}

}
