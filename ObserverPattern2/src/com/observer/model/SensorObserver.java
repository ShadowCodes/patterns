package com.observer.model;

public abstract class SensorObserver {
	protected SensorSubject sensor;
	
	public SensorObserver(SensorSubject sensorSubject) {
		sensor = sensorSubject;
	}
	
	public abstract void alerta();
}
