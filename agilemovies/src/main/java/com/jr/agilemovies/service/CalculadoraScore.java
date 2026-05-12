package com.jr.agilemovies.service;

import com.jr.agilemovies.model.Filme;

public class CalculadoraScore {
	
	private Filme filme;
	private double total;
	private double compatibilidadeGenero;
	private double compatibilidadeDuracao;
	private double popularidade;
	private double afinidade;
	
	public CalculadoraScore(double compatibilidadeGenero, double compatibilidadeDuracao,
			double popularidade, double afinidade) {
		
		this.compatibilidadeGenero = compatibilidadeGenero;
		this.compatibilidadeDuracao = compatibilidadeDuracao;
		this.popularidade = popularidade;
		this.afinidade = afinidade;
		
	}
	
	
	
}
