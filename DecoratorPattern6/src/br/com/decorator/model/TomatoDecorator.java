package br.com.decorator.model;

public class TomatoDecorator extends CondimentDecorator {

	public TomatoDecorator(Pizza pizzaDecorator) {
		super(pizzaDecorator);
	}
	
	public String getDescription() {
		return pizzaDecorator.getDescription() + " + " + this.description;
	}
	public double cost() {
		return pizzaDecorator.cost() + 2.20;
	}

}
