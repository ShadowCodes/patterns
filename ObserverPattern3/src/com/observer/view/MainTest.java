package com.observer.view;

import com.observer.model.Balanca;
import com.observer.model.Dieta;

public class MainTest {
	public static void main(String[] args) {
		Balanca balanca = new Balanca();
		Dieta dieta = new Dieta(50);
		
		dieta.attach(balanca);
		dieta.setPeso(99);
	}
}
