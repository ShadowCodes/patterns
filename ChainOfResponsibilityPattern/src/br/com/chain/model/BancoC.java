package br.com.chain.model;

public class BancoC extends BancoChain {
	
	public BancoC() {
		super(IDBanco.bancoC);
	}

	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado pelo BancoC!");
	}
}
