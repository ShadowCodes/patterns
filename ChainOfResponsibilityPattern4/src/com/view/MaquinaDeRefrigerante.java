package com.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MaquinaDeRefrigerante {
	
	public static double maquinaInterface() {

		try {
			InputStream input = System.in;
			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Passe a grana: ");
			String value = br.readLine();
			Double newValue = new Double(value);
			
			return newValue;
		} catch (IOException e) {
			throw new RuntimeException("Ocorreu um erro!", e);
		}
	}
}
