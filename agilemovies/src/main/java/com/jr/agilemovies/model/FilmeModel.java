package com.jr.agilemovies.model;

import java.util.List;
import java.util.Objects;

import com.jr.agilemovies.model.enums.ClassificacaoEtaria;
import com.jr.agilemovies.model.enums.Genero;
import com.jr.agilemovies.model.enums.Idioma;

public class FilmeModel {
	private String id;
	private String titulo;
	private int ano;
	private int duracao;
	private List<Genero> generos;
	private ClassificacaoEtaria classificacao;
	private Idioma idioma;
	private double popularidade;
	
	public FilmeModel(String id, String titulo, int ano, int duracao, List<Genero> generos,
			ClassificacaoEtaria classificacao, Idioma idioma, double popularidade) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
		this.generos = generos;
		this.classificacao = classificacao;
		this.idioma = idioma;
		this.popularidade = popularidade;
	}
	
	
	@Override
	public boolean equals(Object obj) {

	    if (this == obj)
	        return true;

	    if (obj == null)
	        return false;

	    if (getClass() != obj.getClass())
	        return false;

	    FilmeModel other = (FilmeModel) obj;

	    return Objects.equals(id, other.id);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
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

	public double getPopularidade() {
		return popularidade;
	}

	public void setPopularidade(double popularidade) {
		this.popularidade = popularidade;
	}
	
	
	
}
