package com.relatorio.model;

import java.math.BigDecimal;

public class Item {

	private int codItem;
	private int qtda;
	private BigDecimal preco;

	public int getQtda() {
		return qtda;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setCodItem(int idItem) {
		this.codItem = idItem;
	}

	public void setQtda(int qtda) {
		this.qtda = qtda;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getCodItem() {
		return codItem;
	}
}
