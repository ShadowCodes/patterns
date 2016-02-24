package br.com.decorator.model;

public abstract class Pizza {
	protected String description;
	
	public Pizza() {}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();
}
