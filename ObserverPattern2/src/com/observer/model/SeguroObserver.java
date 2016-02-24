package com.observer.model;

public class SeguroObserver extends SensorObserver {

	public SeguroObserver(SensorSubject sensorSubject) {
		super(sensorSubject);
	}


	public void alerta() {
		System.out.println("Cia de Seguros\n O seguro foi avisado, estamos indo atrás do sensor " + sensor.getStatus().sensorA + "!");
		
	}

}
