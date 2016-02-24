package br.com.inter.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import br.com.inter.controller.Controller;

public class View {
	public static void main(String[] args) {
		
		try {
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Que dia da semana é hoje?");
			String option = br.readLine();
			
			new Controller(option).escolheMetodo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Erro na entrada e saída!", e);
		}
	}
}
