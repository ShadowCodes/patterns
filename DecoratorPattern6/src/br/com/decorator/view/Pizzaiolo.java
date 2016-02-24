package br.com.decorator.view;

import br.com.decorator.model.Mozzarella;
import br.com.decorator.model.OreganoDecorator;
import br.com.decorator.model.Pizza;
import br.com.decorator.model.TomatoDecorator;

public class Pizzaiolo {
	public static void main(String[] args) {
		Pizza pizza1 = new Mozzarella();
		pizza1.setDescription("Pizza de Mozzarella");
		System.out.println(pizza1.getDescription() + " = " + pizza1.cost());
		
		pizza1 = new TomatoDecorator(pizza1); //Pega o que era antes através do pizzaDecorator, ou seja era Pizza de Mozzarella
		pizza1.setDescription("Tomates fresquinhos"); //Setou nova descrição para o novo pizza1 = "new Tomate()"
		System.out.println(pizza1.getDescription() + " = " + pizza1.cost()); //Retorno: O anterior + o atual
		
		pizza1 = new OreganoDecorator(pizza1);
		pizza1.setDescription("Óregano fresquinho");
		System.out.println(pizza1.getDescription() + " = " + pizza1.cost());
		

		
	}
}
