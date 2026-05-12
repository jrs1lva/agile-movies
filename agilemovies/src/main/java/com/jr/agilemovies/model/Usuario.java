package com.jr.agilemovies.model;

public class Usuario {
	
	private String nome;
	private int idade;
	private PerfilCinefilo perfil;
	
	public Usuario(String nome, int idade, PerfilCinefilo perfil) {
		
		this.nome = nome;
		this.idade = idade;
		this.perfil = perfil;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public PerfilCinefilo getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilCinefilo perfil) {
		this.perfil = perfil;
	}
	
	
}
