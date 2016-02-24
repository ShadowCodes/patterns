package br.com.chain.model;

public class BancoC extends Banco{
	
	public BancoC(int codigo) {
		super(codigo);
	}

	public void aprova(int numero) throws Exception {
		if (this.codigo == numero) {
			System.out.println("O Banco C realizou pagamento!");
		} else {
			throw new Exception("Banco não encontrado!");
		}
	}
}
