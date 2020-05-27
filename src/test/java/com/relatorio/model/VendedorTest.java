package com.relatorio.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class VendedorTest {

	private final BigDecimal SALARIO = new BigDecimal(1200);
	private final String NOME_VENDEDOR = "valnei";
	private final String CPF_VENDENDOR = "123456";
	

	private Vendedor vendedor;

	@Before
	public void setupTest() {
		vendedor = new Vendedor(CPF_VENDENDOR, NOME_VENDEDOR, SALARIO);

	}

	@Test
	public void testaVendedorGetNomeFunciona() {
		String expected = NOME_VENDEDOR;
		assertEquals(expected, vendedor.getNomeVendedor());
	}

	@Test
	public void testaSeVendedorGetCpfFunciona() {
		String expected = CPF_VENDENDOR;
		assertEquals(expected, vendedor.getCpf());
	}

	@Test
	public void testaVendedorSalario() {
		BigDecimal expected = new BigDecimal(1200);
		assertEquals(expected, vendedor.getSalario());
	}

}
