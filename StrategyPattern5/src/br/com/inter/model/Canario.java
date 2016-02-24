package br.com.inter.model;

public class Canario extends Ave {
	
	public Canario() {
		this.modoDeBicagem = new NaoBica();
		this.modoDeCanto = new BoleroDeRavel();
		this.modoDeVoo = new VoaComAsas();
	}

	public void exibeMensagem() {
		System.out.println("Sou um Canário!");
	}
}
