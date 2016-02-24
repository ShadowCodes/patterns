package br.com.chain.model;

public class BancoB extends BancoChain {
	public BancoB() {
		super(IDBanco.bancoB);
	}

	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado pelo BancoB!");
	}
}
