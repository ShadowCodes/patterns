package com.view;

import com.model.Refrigerante;
import com.model.Slot;
import com.model.SlotA;
import com.model.SlotB;
import com.model.SlotC;
import com.model.SlotD;

public class Main {
	public static void main(String[] args) {
		Refrigerante refrigerante = new Refrigerante("Coca cola", 3.5);
		
		Slot slotA = new SlotA();
		Slot slotB = new SlotB();
		Slot slotC = new SlotC();
		Slot slotD = new SlotD();
		
		
		slotA.setNext(slotB);
		slotB.setNext(slotC);
		slotC.setNext(slotD);

		try {
			slotA.verificaMaquinaDinheiro(refrigerante);
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro no bloco de execução!", e);
		}
	}
}
