package com.jr.agilemovies.model;

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
	
	public PerfilCinefiloModel(Map<Genero, Double> pesosGenero, int duracaoMinima, int duracaoMaxima,
			ClassificacaoEtaria classificacaoMaxima, List<Idioma> idiomasAceitos, List<String> filmesAssistidos,
			Map<String, Integer> notas) {
		
		this.pesosGenero = pesosGenero;
		this.duracaoMinima = duracaoMinima;
		this.duracaoMaxima = duracaoMaxima;
		this.classificacaoMaxima = classificacaoMaxima;
		this.idiomasAceitos = idiomasAceitos;
		this.filmesAssistidos = filmesAssistidos;
		this.notas = notas;
		
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
	
	public Map<Genero, Double> getPesosGenero() {
		return pesosGenero;
	}
	public void setPesosGenero(Map<Genero, Double> pesosGenero) {
		this.pesosGenero = pesosGenero;
	}
	public int getDuracaoMinima() {
		return duracaoMinima;
	}
	public void setDuracaoMinima(int duracaoMinima) {
		this.duracaoMinima = duracaoMinima;
	}
	public int getDuracaoMaxima() {
		return duracaoMaxima;
	}
	public void setDuracaoMaxima(int duracaoMaxima) {
		this.duracaoMaxima = duracaoMaxima;
	}
	public ClassificacaoEtaria getClassificacaoMaxima() {
		return classificacaoMaxima;
	}
	public void setClassificacaoMaxima(ClassificacaoEtaria classificacaoMaxima) {
		this.classificacaoMaxima = classificacaoMaxima;
	}
	public List<Idioma> getIdiomasAceitos() {
		return idiomasAceitos;
	}
	public void setIdiomasAceitos(List<Idioma> idiomasAceitos) {
		this.idiomasAceitos = idiomasAceitos;
	}
	public List<String> getFilmesAssistidos() {
		return filmesAssistidos;
	}
	public void setFilmesAssistidos(List<String> filmesAssistidos) {
		this.filmesAssistidos = filmesAssistidos;
	}
	public Map<String, Integer> getNotas() {
		return notas;
	}
	public void setNotas(Map<String, Integer> notas) {
		this.notas = notas;
	}
	
	
	
}
