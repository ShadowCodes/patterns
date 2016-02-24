package br.com.strategypattern.model;

import java.math.BigDecimal;

public class Soma implements Calculo {

	public BigDecimal calcula(BigDecimal valorA, BigDecimal valorB) {
		return valorA.add(valorB);
	}

}
