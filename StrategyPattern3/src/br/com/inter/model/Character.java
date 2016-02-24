package br.com.inter.model;

public abstract class Character {
	Weapon weapon;
	
	public void fight() { //O m�todo "fight" tem apenas um comportamento
		System.out.println("Fighting. . .");
	}
	
	public void useWeapon() { //O m�todo usar arma tem v�rios comportamentos, pois podem usar v�rias armas
		weapon.useWeapon();
	}
}
