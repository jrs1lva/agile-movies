package com.jr.agilemovies.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jr.agilemovies.exception.DuracaoInvalidaException;
import com.jr.agilemovies.exception.NotaInvalidaException;
import com.jr.agilemovies.exception.PesoInvalidoException;
import com.jr.agilemovies.model.enums.ClassificacaoEtaria;
import com.jr.agilemovies.model.enums.Genero;
import com.jr.agilemovies.model.enums.Idioma;

public class PerfilCinefiloModel {
	
	
	
	//DEVE TERMINAR AS VALIDAÇÕES
	
	
	
	private Map<Genero, Double> pesosGenero;
	
	private int duracaoMinima;
	private int duracaoMaxima;
	
	private ClassificacaoEtaria classificacaoMaxima;
	private List<Idioma> idiomasAceitos;
	private List<String> filmesAssistidos;
	private Map<String, Integer> notas;
	
	public PerfilCinefiloModel(int duracaoMinima, int duracaoMaxima, ClassificacaoEtaria classificacaoMaxima) {
		
		definirDuracao(duracaoMinima, duracaoMaxima);
		
		this.classificacaoMaxima = classificacaoMaxima;
		
		this.pesosGenero = new HashMap<Genero, Double>();
		this.idiomasAceitos = new ArrayList<Idioma>();
		this.filmesAssistidos = new ArrayList<String>();
		this.notas = new HashMap<String, Integer>();
		
	}
	
	private void validarPeso(double peso) {
		if (peso < 0 || peso > 1) {
			throw new PesoInvalidoException("O peso deve estar entre 0 e 1.");
		}
	}
	
	private void validarDuracao(int duracaoMinima, int duracaoMaxima) {
		if (duracaoMinima > duracaoMaxima) {
			throw new DuracaoInvalidaException("A duração mínima deve ser menor que a duração máxima.");
		}
	}
	
	private void validarNota(int nota) {
		if (nota < 1 || nota > 5) {
			throw new NotaInvalidaException("A nota deve estar entre 1 e 5.");
		}
	}
	
	public void adicionarIdioma(Idioma idioma) {
		idiomasAceitos.add(idioma);
	}
	
	public void adicionarNota(int nota, String filmeId) {
		validarNota(nota);
		notas.put(filmeId, nota);
	}
	
	public void adicionarFilmeAssistido(String filmeId) {
		filmesAssistidos.add(filmeId);
	}
	
	public void definirDuracao(int duracaoMinima, int duracaoMaxima) {
		validarDuracao(duracaoMinima, duracaoMaxima);
		this.duracaoMinima = duracaoMinima;
		this.duracaoMaxima = duracaoMaxima;
	}
	
	public void definirPesoGenero(Genero genero, double peso) {
		validarPeso(peso);
		pesosGenero.put(genero, peso);
	}
	
	// SETS AND GETTERS
	
	public int getDuracaoMinima() {
		return duracaoMinima;
	}
	
	public int getDuracaoMaxima() {
		return duracaoMaxima;
	}
		
	public ClassificacaoEtaria getClassificacaoMaxima() {
		return classificacaoMaxima;
	}
	
	public Map<Genero, Double> getPesosGenero() {
		return new HashMap<>(pesosGenero);
	}
	
	public List<Idioma> getIdiomasAceitos() {
		return new ArrayList<>(idiomasAceitos);
	}

	public List<String> getFilmesAssistidos() {
		return new ArrayList<>(filmesAssistidos);
	}

	public Map<String, Integer> getNotas() {
		return new HashMap<>(notas);
	}

	
	
	
}
