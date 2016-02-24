package com.observer.model;


public interface Observable {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notifyObservers();
}
