package br.com.chain.view;

import br.com.chain.model.Banco;
import br.com.chain.model.BancoA;
import br.com.chain.model.BancoB;
import br.com.chain.model.BancoC;

public class MainTest {
	public static void main(String[] args) {
		Banco bancoA = new BancoA(1);
		Banco bancoB = new BancoB(3);
		Banco bancoC = new BancoC(6);
		
		bancoA.setSuccessor(bancoB);
		bancoB.setSuccessor(bancoC);
		
		try {
			bancoA.aprova(1);
		} catch(Exception e) {
			throw new RuntimeException("Erro na cadeia de responsabilidade!", e);
		}
	}
}
