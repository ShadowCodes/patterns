package br.com.decorator.model;

public class OreganoDecorator extends CondimentDecorator {

	public OreganoDecorator(Pizza pizzaDecorator) {
		super(pizzaDecorator);
	}
	
	public String getDescription() {
		return pizzaDecorator.getDescription() + " + " + this.description;
	}
	
	public double cost() {
		return pizzaDecorator.cost() + 1.70;
	}
	
}
