package br.com.strategypattern.model;

import java.math.BigDecimal;

public class Subtracao implements Calculo {

	public BigDecimal calcula(BigDecimal valorA, BigDecimal valorB) {
		return valorA.subtract(valorB);
	}

}
