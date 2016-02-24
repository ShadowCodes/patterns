package br.com.strategypattern.model;

import java.math.BigDecimal;

public interface Calculo {
	public BigDecimal calcula(BigDecimal valorA, BigDecimal valorB);
}
