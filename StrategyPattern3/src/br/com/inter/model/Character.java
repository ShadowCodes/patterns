package br.com.inter.model;

public abstract class Character {
	Weapon weapon;
	
	public void fight() { //O método "fight" tem apenas um comportamento
		System.out.println("Fighting. . .");
	}
	
	public void useWeapon() { //O método usar arma tem vários comportamentos, pois podem usar várias armas
		weapon.useWeapon();
	}
}
