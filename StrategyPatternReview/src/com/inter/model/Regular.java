package com.inter.model;

public class Regular implements Promocao {
	private double descontoExtra;

	public Regular(double descontoExtra) {
		this.descontoExtra = descontoExtra;
	}
	
	public double desconta() {
		if ((descontoExtra >= 0.05) && (descontoExtra <= 0.1)) {
			return 0.1 + descontoExtra;
		} else {
			return 0.1;
		}

	}

}
