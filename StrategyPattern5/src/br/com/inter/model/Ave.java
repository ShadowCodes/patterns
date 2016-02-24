package br.com.inter.model;

public abstract class Ave {
	ModoDeCanto modoDeCanto;
	ModoDeVoo modoDeVoo;
	ModoDeBicagem modoDeBicagem;
	
	//Methods
	public void canta() {
		modoDeCanto.canta();
	}
	
	public void voa() {
		modoDeVoo.voa();
	}
	
	public void bica() {
		modoDeBicagem.bica();
	}
	
	public abstract void exibeMensagem();
}
