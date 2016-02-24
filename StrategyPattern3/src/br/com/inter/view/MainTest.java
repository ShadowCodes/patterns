package br.com.inter.view;

import br.com.inter.model.Goblin;
import br.com.inter.model.King;
import br.com.inter.model.Queen;
import br.com.inter.model.Warrior;

public class MainTest {
	public static void main(String[] args) {
		Warrior kingLeon = new King();
		kingLeon.useWeapon();
		Warrior queenMia = new Queen();
		queenMia.useWeapon();
		Warrior goblinRay = new Goblin();
		goblinRay.useWeapon();
	}
}
