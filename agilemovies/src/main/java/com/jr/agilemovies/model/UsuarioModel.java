package com.jr.agilemovies.model;

public class UsuarioModel {
	
	private String nome;
	private int idade;
	private PerfilCinefiloModel perfil;
	
	public UsuarioModel(String nome, int idade, PerfilCinefiloModel perfil) {
		
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

	public PerfilCinefiloModel getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilCinefiloModel perfil) {
		this.perfil = perfil;
	}
	
	
}
