package com.observer.view;

import java.util.ArrayList;
import java.util.List;

import com.observer.model.Dado;
import com.observer.model.DadoObserver;
import com.observer.model.DadoSubject;
import com.observer.model.PorcentoObserver;
import com.observer.model.TabelaObserver;

public class Cliente {
	public static void main(String[] args) {
		DadoSubject dados = new DadoSubject();
		dados.attach(new TabelaObserver(dados));
		//dados.attach(new BarraObserver(dados));
		dados.attach(new PorcentoObserver(dados));

		dados.setState(new Dado(7, 3, 1));
		dados.setState(new Dado(2, 3, 1));
		
		dados.notifyObserver();
	
	}
}
