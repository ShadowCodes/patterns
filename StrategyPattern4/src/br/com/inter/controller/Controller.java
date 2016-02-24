package br.com.inter.controller;

import java.util.HashMap;
import java.util.Map;

import br.com.inter.model.Domingo;
import br.com.inter.model.Mensagem;
import br.com.inter.model.Quarta;
import br.com.inter.model.Quinta;
import br.com.inter.model.Sabado;
import br.com.inter.model.Segunda;
import br.com.inter.model.Sexta;
import br.com.inter.model.Terça;

public class Controller {
	String option;
	
	public Controller(String option) {
		this.option = option;
	}
	
	public void escolheMetodo() {
		Map<String, Mensagem> mapaDeOpcoes = new HashMap<>();
		mapaDeOpcoes.put("Segunda", new Segunda());
		mapaDeOpcoes.put("Terça", new Terça());
		mapaDeOpcoes.put("Quarta", new Quarta());
		mapaDeOpcoes.put("Quinta", new Quinta());
		mapaDeOpcoes.put("Sexta", new Sexta());
		mapaDeOpcoes.put("Sabado", new Sabado());
		mapaDeOpcoes.put("Domingo", new Domingo());
		
		Mensagem mensagem = (Mensagem) mapaDeOpcoes.get(option); //Necessita de um casting
		mensagem.exibeMensagem();
	}

}
