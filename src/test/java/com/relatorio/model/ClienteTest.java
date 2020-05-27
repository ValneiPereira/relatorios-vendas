package com.relatorio.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class ClienteTest {
	
	Cliente clienteTeste;
	
	@Before
	public void setupTest() {
		clienteTeste = new Cliente("123456", "Valnei", "programador");
	}
	
	@Test
	public void testaClienteGetNomeFunciona() { 
		String expected = "Valnei";
		assertEquals(expected, clienteTeste.getNome());
	}
	@Test
	public void testaClienteGetCnpjFunciona() { 
		String expected = "123456";
		assertEquals(expected, clienteTeste.getCpf());
	}
	
	@Test
	public void testaClienteGetBusinessAreaFunciona() { 
		String expected = "programador";
		assertEquals(expected, clienteTeste.getAreNegocios());
	}

}
