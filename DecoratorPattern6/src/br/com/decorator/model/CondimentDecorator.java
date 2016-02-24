package br.com.decorator.model;

public abstract class CondimentDecorator extends Pizza {
	protected Pizza pizzaDecorator;
	
	public CondimentDecorator(Pizza pizzaDecorator) {
		this.pizzaDecorator = pizzaDecorator;
	}

	public abstract double cost();



	
	
	
}
