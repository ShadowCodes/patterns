package br.com.chain.view;

import br.com.chain.model.BancoA;
import br.com.chain.model.BancoB;
import br.com.chain.model.BancoC;
import br.com.chain.model.BancoChain;
import br.com.chain.model.BancoD;
import br.com.chain.model.IDBanco;

public class MainTest {
	public static void main(String[] args) {
		BancoChain banco = new BancoA();
		banco.setNext(new BancoB());
		banco.setNext(new BancoC());
		banco.setNext(new BancoD());
		
		try {
			banco.efetuarPagamento(IDBanco.bancoC);
			banco.efetuarPagamento(IDBanco.bancoD);
			banco.efetuarPagamento(IDBanco.bancoA);
			banco.efetuarPagamento(IDBanco.bancoB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
