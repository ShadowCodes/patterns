package br.com.chain.model;

public abstract class BancoChain {
	protected BancoChain next;
	protected IDBanco identificadorBanco;
	
	public BancoChain(IDBanco identificadorBanco) { //BancoA vem como par�metro - BancoB vem como par�metro
		next = null; //Agora o next que � do tipo "BancoChain" � nulo, o next ainda � nulo, 
		this.identificadorBanco = identificadorBanco; //Agora o identificadorBanco equivale a "A", identificadorBanco equivale a "B"
	}
	
	public void setNext(BancoChain forma) {
		if (next == null) { //Se for nulo, ent�o atribui ao pr�ximo da corrente, no caso seria o BancoB // Agora o Next carrega o bancoB e n�o � mais nulo
			next = forma; //Next recebe o BancoB
		} else {
			next.setNext(forma); //Sen�o repassa a responsabilidade para o pr�ximo da corrente //BancoB passa como par�metro o BancoC, next agora � nulo porque BancoC � uma nova inst�ncia
		}
	}
	
	private boolean podeEfetuarPagamento(IDBanco id) {
		if (identificadorBanco == id) {
			return true;
		}
		return false;
	}
	
	
	public void efetuarPagamento(IDBanco id) throws Exception {
		if (podeEfetuarPagamento(id)) { //Verifica se o identificador � compat�vel, se verdadeiro ent�o ele vai pro m�todo abstrato
			efetuaPagamento(); //Aqui estamos chamando um m�todo abstrato abaixo
		} else {
			if (next == null) { //Sen�o, se o next for null ele estoura um erro
				throw new Exception("Banco n�o cadastrado!");
			}
			next.efetuarPagamento(id); //Caso contr�rio  o pr�ximo chama o m�todo
		}
	}
	
	protected abstract void efetuaPagamento(); //Template Method

}
