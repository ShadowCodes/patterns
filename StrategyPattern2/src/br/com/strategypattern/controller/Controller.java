package br.com.strategypattern.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import br.com.strategypattern.model.Calculo;
import br.com.strategypattern.model.Divisao;
import br.com.strategypattern.model.Multiplicacao;
import br.com.strategypattern.model.Soma;
import br.com.strategypattern.model.Subtracao;

public class Controller {
	private BigDecimal valorA;
	private BigDecimal valorB;
	private String option;
	Map<String, Calculo> mapaDeOpcoes = new HashMap<>();
	
	public Controller(BigDecimal valorA, BigDecimal valorB, String option) {
		this.valorA = valorA;
		this.valorB = valorB;
		this.option = option;
	}
	
	public BigDecimal getResultado() {
		mapaDeOpcoes.put("1", new Soma());
		mapaDeOpcoes.put("2", new Subtracao());
		mapaDeOpcoes.put("3", new Multiplicacao());
		mapaDeOpcoes.put("4", new Divisao());
		
		Calculo calculo = (Calculo) mapaDeOpcoes.get(option);
		
		return calculo.calcula(valorA, valorB);
	}
	



}
