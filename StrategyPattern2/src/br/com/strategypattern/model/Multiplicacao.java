package br.com.strategypattern.model;

import java.math.BigDecimal;

public class Multiplicacao implements Calculo {

	public BigDecimal calcula(BigDecimal valorA, BigDecimal valorB) {
		return valorA.multiply(valorB);
	}
	
}
