package com.observer.model;

import java.util.ArrayList;
import java.util.List;

public class SensorSubject {
	private List<SensorObserver> observer;
	private Sensor sensor;
	
	public SensorSubject() {
		observer = new ArrayList<>();
	}
	
	public void attach(SensorObserver observer) {
		this.observer.add(observer);
	}
	
	public void detach(int index) {
		this.observer.remove(index);
	}
	
	public void setStatus(Sensor sensor) {
		this.sensor = sensor;
	}
	
	public Sensor getStatus() {
		return sensor;
	}
	
	public void notifyObserver() {
		for (SensorObserver observer : this.observer) {
			observer.alerta();
		}
	}
	
}
