package com.observer.view;

import com.observer.model.Clima;
import com.observer.model.Observer;
import com.observer.model.TempoA;
import com.observer.model.TempoB;
import com.observer.model.TempoC;
import com.observer.model.TempoChuva;

public class MainTest {
	public static void main(String[] args) {
		Clima clima = new Clima(20, 30);
		Observer tempoA = new TempoA();
		Observer tempoB = new TempoB();
		Observer tempoC = new TempoC();
		Observer tempoChuva = new TempoChuva();
		
		clima.attach(tempoA);
		clima.attach(tempoB);
		clima.attach(tempoC);
		clima.attach(tempoChuva);
		
		clima.setTemperatura(13);
		//clima.setUmidade(51);
		
		
	}
}
