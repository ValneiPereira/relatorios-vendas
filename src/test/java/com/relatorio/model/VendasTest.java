package com.relatorio.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class VendasTest {

	private final BigDecimal SALARIO = new BigDecimal(1200);
	private final int ID = 1;
	private final int QTDA = 10;
	private final String NOME_VENDEDOR = "valnei";
	private final String CPF_VENDENDOR = "123456";
	private final String NOME_CLIENTE = "agusto";
	private final String CPF_CLIENTE = "654321";
	private final String AREA_NEGOCIO = "faz nada";

	private Cliente cliente;
	private Venda vendaTeste;
	private Vendedor vendedor;
	

	@Before
	public void setupTest() {

		vendedor = new Vendedor(CPF_VENDENDOR, NOME_VENDEDOR, SALARIO);
		cliente = new Cliente(CPF_CLIENTE, NOME_CLIENTE, AREA_NEGOCIO);

		vendaTeste = new Venda();
		vendaTeste.setIdVenda(ID);
		vendaTeste.setNomeVendedor(NOME_VENDEDOR);
		vendaTeste.setVendedores(vendedor);
		vendaTeste.setCliente(cliente);
		vendaTeste.setQtdaProdutos(QTDA);

	}

	@Test
	public void testaVendaGetIdFunciona() {
		int expected = 1;
		assertEquals(expected, vendaTeste.getIdVenda());
	}

	@Test
	public void testaNomeVendedor() {
		String nomeVendedor = NOME_VENDEDOR;
		assertEquals(nomeVendedor, vendaTeste.getNomeVendedor());
	}

	@Test
	public void testaVendedorCpf() {
		String expected = CPF_VENDENDOR;
		assertEquals(expected, vendaTeste.getVendedores().getCpf());
	}

	@Test
	public void testaClienteCpf() {
		String expected = CPF_CLIENTE;
		assertEquals(expected, vendaTeste.getCliente().getCpf());
	}

	@Test
	public void testaQtdaProdutos() {
		int expected = QTDA;
		assertEquals(expected, vendaTeste.getQtdaProdutos());
	}

}
