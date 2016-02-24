package com.observer.model;

public class DelegaciaObserver extends SensorObserver {

	public DelegaciaObserver(SensorSubject sensorSubject) {
		super(sensorSubject);
	}


	public void alerta() {
		System.out.println("Delegacia\nA delegacia foi alertada, viaturas à caminho!");
	}

}
