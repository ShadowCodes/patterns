package br.com.chain.model;

public class BancoA extends Banco {

	public BancoA(int codigo) {
		super(codigo);
	}

	public void aprova(int numero) throws Exception {
		if (this.codigo == numero) {
			System.out.println("O Banco A realizou pagamento!");
		} else {
			System.out.println("Eu, 'A', passei para o próximo!");
			successor.aprova(numero);
		}
	}

}
