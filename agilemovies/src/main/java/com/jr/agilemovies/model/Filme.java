package com.jr.agilemovies.model;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jr.agilemovies.model.enums.ClassificacaoEtaria;
import com.jr.agilemovies.model.enums.Genero;
import com.jr.agilemovies.model.enums.Idioma;

public class Filme {
	private String id;
	private String titulo;
	private int ano;
	private int duracao;
	private List<Genero> generos;
	private ClassificacaoEtaria classificacao;
	private Idioma idioma;
	private double popularidade;
	
	public Filme(String id, String titulo, int ano, int duracao,
			ClassificacaoEtaria classificacao, Idioma idioma, double popularidade) {
		
		validarTexto(id);
		validarTexto(titulo);
		validarAno(ano);
		validarDuracao(duracao);
		validarPopularidade(popularidade);
		
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
		this.classificacao = classificacao;
		this.idioma = idioma;
		this.popularidade = popularidade;
		
		this.generos = new ArrayList<Genero>();
	}
	
	@Override
	public boolean equals(Object obj) {

	    if (this == obj)
	        return true;

	    if (obj == null)
	        return false;

	    if (getClass() != obj.getClass())
	        return false;

	    Filme other = (Filme) obj;

	    return Objects.equals(id, other.id);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}
	
	public void adicionarGenero(Genero genero) {
		if (!generos.contains(genero)) {
			generos.add(genero);
		}
	}
	
	private void validarAno(int ano) {
		
		int anoAtual = Year.now().getValue();
		
		if (ano < 1800 || ano > anoAtual) {
			throw new IllegalArgumentException("Não existe filme nesse ano selecionado.");
		}
		
	}
	
	private void validarDuracao(int duracao) {
		if (duracao <= 0) {
			throw new IllegalArgumentException("A duração deve ser maior que 0 minutos.");
		}
	}
	
	private void validarPopularidade(double popularidade) {
		if (popularidade < 0 || popularidade > 100) {
			throw new IllegalArgumentException("A popularidade deve estar entre 0 e 100.");
		}
	}
	
	private void validarTexto(String texto) {
		if (texto == null || texto.isBlank()) {
			throw new IllegalArgumentException("Texto não pode ser vazio");
		}
	}
	
	public List<Genero> getGeneros() {
		return new ArrayList<>(generos);
	}
	
	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		validarTexto(titulo);
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		validarAno(ano);
		this.ano = ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		validarDuracao(duracao);
		this.duracao = duracao;
	}

	public double getPopularidade() {
		return popularidade;
	}

	public void setPopularidade(double popularidade) {
		validarPopularidade(popularidade);
		this.popularidade = popularidade;
	}

	public ClassificacaoEtaria getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoEtaria classificacao) {
		this.classificacao = classificacao;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}	
	
}
