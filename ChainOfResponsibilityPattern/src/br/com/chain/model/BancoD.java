package br.com.chain.model;

public class BancoD extends BancoChain {
	
	public BancoD() {
		super(IDBanco.bancoD);
	}

	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado pelo BancoD!");
	}
}
