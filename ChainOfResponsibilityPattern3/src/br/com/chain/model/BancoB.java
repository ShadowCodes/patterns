package br.com.chain.model;

public class BancoB extends Banco{
	
	public BancoB(int codigo) {
		super(codigo);
	}

	public void aprova(int numero) throws Exception {
		if (this.codigo == numero) {
			System.out.println("O Banco B realizou pagamento!");
		} else {
			System.out.println("Eu, 'B', passei para o próximo");
			successor.aprova(numero);
		}
	}
}
