package br.com.inter.model;

public class Regular implements Promocao {
	
	private double extra;
	
	public Regular(double extra) {
		if ((extra == 0.95) || (extra == 0.90)) {
			this.extra = extra;
		} else {
			this.extra = 1;
		}
	}
	
	public double desconta() {
		return extra * 0.9;
	}
	
}
