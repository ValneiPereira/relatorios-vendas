package com.relatorio.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	private final int ID = 1;
	private final int QTDA = 10;
	
	private Item itemTest;
	private final BigDecimal PRECO = new BigDecimal(0.50);
	
	@Before
	public void setupTest() {
		
		itemTest = new Item();
		itemTest.setCodItem(ID);
		itemTest.setQtda(QTDA);
		itemTest.setPreco(PRECO);
		
	}
	@Test
	public void testaItemGetId() {
		int expected = 1;
		assertEquals(expected, itemTest.getCodItem());
	}
	@Test
	public void testaItemQtda() {
		int expected = QTDA;
		assertEquals(expected, itemTest.getQtda());
	}
	@Test
	public void testaItemPreco() {
		BigDecimal expected = new BigDecimal(0.50);
		assertEquals(expected, itemTest.getPreco());
	}
	
	

}
