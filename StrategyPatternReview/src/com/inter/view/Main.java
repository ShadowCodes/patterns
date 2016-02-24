package com.inter.view;

import com.inter.model.Brinquedo;
import com.inter.model.DVD;
import com.inter.model.Produto;
import com.inter.model.Promocao;
import com.inter.model.Regular;

public class Main {
	public static void main(String[] args) {
		Produto dvd = new DVD("Sony Home Teather", 1800);
		Produto brinquedo = new Brinquedo("ClothMyth", 390);
		Promocao regular = new Regular(0.1);
		brinquedo.setPromocao(regular);
		System.out.println(brinquedo.calcPreco());
	}
}
