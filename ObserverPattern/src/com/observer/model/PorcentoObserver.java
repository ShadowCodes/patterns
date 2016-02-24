package com.observer.model;

import java.text.DecimalFormat;

public class PorcentoObserver extends DadoObserver {

	public PorcentoObserver(DadoSubject dado) {
		super(dado);
	}


		public void update() {
	        int somaDosValores = dado.getState().valorA + dado.getState().valorB
	                + dado.getState().valorC;
	        DecimalFormat formatador = new DecimalFormat("#.##");
	        String porcentagemA = formatador.format((double) dado.getState().valorA
	                / somaDosValores);
	        String porcentagemB = formatador.format((double) dado.getState().valorB
	                / somaDosValores);
	        String porcentagemC = formatador.format((double) dado.getState().valorC
	                / somaDosValores);
	        System.out.println("Porcentagem:\nValor A: " + porcentagemA
	                + "%\nValor B: " + porcentagemB + "%\nValor C: " + porcentagemC
	                + "%");
	    }
		
}
