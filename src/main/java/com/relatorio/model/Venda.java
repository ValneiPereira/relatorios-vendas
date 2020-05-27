package com.relatorio.model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Venda {

	private int idVenda;
	private List<Item> listaItem;
	private String nomeVendedor;
	private Vendedor vendedores;
	private Cliente cliente;
	private int qtdaProdutos;

	public Venda() {
		this.listaItem = new LinkedList<>();
		this.qtdaProdutos = 0;
	}

	public void adicionarItem(Item item) {
		listaItem.add(item);
	}

	public BigDecimal getPrecoTotal() {
		BigDecimal totalVenda = new BigDecimal(0);
		for (Item i : listaItem) {
			BigDecimal qtd = new BigDecimal(i.getQtda());
			BigDecimal totalItem = qtd.multiply(i.getPreco());
			totalVenda = totalVenda.add(totalItem);
		}

		return totalVenda;
	}

	public int incrementaProdutos() {
		return this.qtdaProdutos++;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public List<Item> getListaItem() {
		return listaItem;
	}

	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Vendedor getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor vendedores) {
		this.vendedores = vendedores;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQtdaProdutos() {
		return qtdaProdutos;
	}

	public void setQtdaProdutos(int qtdaProdutos) {
		this.qtdaProdutos = qtdaProdutos;
	}

	

}
