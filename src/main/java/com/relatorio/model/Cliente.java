package com.relatorio.model;

public class Cliente {

	private String cpf;
	private String nome;
	private String areNegocios;

	public Cliente() {

	}

	public Cliente(String cpf, String nome, String areNegocios) {
		this.cpf = cpf;
		this.nome = nome;
		this.areNegocios = areNegocios;
	}
	
	public String getNome() {
		return nome;
	}

	public String getAreNegocios() {
		return areNegocios;
	}

	public String getCpf() {
		return cpf;
	}
	

	
	

}
