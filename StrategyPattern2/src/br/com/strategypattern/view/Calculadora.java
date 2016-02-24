package br.com.strategypattern.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import br.com.strategypattern.controller.Controller;

public class Calculadora {
	public static void main(String[] args) {
	
		try {
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			InputStream is2 = System.in;
			InputStreamReader isr2 = new InputStreamReader(is2);
			BufferedReader br2 = new BufferedReader(isr2);
			

			
			System.out.println("Seja bem vindo � Calculadora Din�mica!");
			System.out.println("Digite seu valor: ");
			String valueA = br.readLine();
			double newValueA = Double.parseDouble(valueA);
			BigDecimal valorA = new BigDecimal(newValueA);
			
			System.out.println("Digite seu outro valor: ");
			String valueB = br2.readLine();
			double newValueB = Double.parseDouble(valueB);
			BigDecimal valorB = new BigDecimal(newValueB);
			
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o ");
			System.out.println("4 - Divis�o");
			String option = br.readLine();
			
			System.out.println("Resultado da opera��o: " + new Controller(valorA, valorB, option).getResultado());
			
			
		} catch (Exception e) {
			throw new RuntimeException("Imposs�vel realizar a opera��o de coleta de dados!", e);
		}
	}
}
