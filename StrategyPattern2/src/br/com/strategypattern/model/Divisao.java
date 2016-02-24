package br.com.strategypattern.model;

import java.math.BigDecimal;

public class Divisao implements Calculo {

	public BigDecimal calcula(BigDecimal valorA, BigDecimal valorB) {
		return valorA.divide(valorB);
	}

}
