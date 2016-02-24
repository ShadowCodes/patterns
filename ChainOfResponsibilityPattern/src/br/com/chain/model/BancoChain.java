package br.com.chain.model;

public abstract class BancoChain {
	protected BancoChain next;
	protected IDBanco identificadorBanco;
	
	public BancoChain(IDBanco identificadorBanco) { //BancoA vem como parâmetro - BancoB vem como parâmetro
		next = null; //Agora o next que é do tipo "BancoChain" é nulo, o next ainda é nulo, 
		this.identificadorBanco = identificadorBanco; //Agora o identificadorBanco equivale a "A", identificadorBanco equivale a "B"
	}
	
	public void setNext(BancoChain forma) {
		if (next == null) { //Se for nulo, então atribui ao próximo da corrente, no caso seria o BancoB // Agora o Next carrega o bancoB e não é mais nulo
			next = forma; //Next recebe o BancoB
		} else {
			next.setNext(forma); //Senão repassa a responsabilidade para o próximo da corrente //BancoB passa como parâmetro o BancoC, next agora é nulo porque BancoC é uma nova instância
		}
	}
	
	private boolean podeEfetuarPagamento(IDBanco id) {
		if (identificadorBanco == id) {
			return true;
		}
		return false;
	}
	
	
	public void efetuarPagamento(IDBanco id) throws Exception {
		if (podeEfetuarPagamento(id)) { //Verifica se o identificador é compatível, se verdadeiro então ele vai pro método abstrato
			efetuaPagamento(); //Aqui estamos chamando um método abstrato abaixo
		} else {
			if (next == null) { //Senão, se o next for null ele estoura um erro
				throw new Exception("Banco não cadastrado!");
			}
			next.efetuarPagamento(id); //Caso contrário  o próximo chama o método
		}
	}
	
	protected abstract void efetuaPagamento(); //Template Method

}
