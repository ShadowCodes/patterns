package com.observer.view;

import com.observer.model.DelegaciaObserver;
import com.observer.model.SeguroObserver;
import com.observer.model.Sensor;
import com.observer.model.SensorSubject;

public class Cliente {
	public static void main(String[] args) {
		SensorSubject sensor = new SensorSubject();
		sensor.attach(new DelegaciaObserver(sensor));
		sensor.attach(new SeguroObserver(sensor));
		
		sensor.setStatus(new Sensor(1));
		
		sensor.notifyObserver();
	}
}
