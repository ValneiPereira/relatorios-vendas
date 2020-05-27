package com.relatorio.model;

import java.math.BigDecimal;

public class Vendedor {

	private String cpf;
	private String nomeVendedor;
	private BigDecimal salario = new BigDecimal(0);

	public Vendedor(String cpf, String nomeVendedor, BigDecimal salario) {
		this.cpf = cpf;
		this.nomeVendedor = nomeVendedor;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public BigDecimal getSalario() {
		return salario;
	}

}
