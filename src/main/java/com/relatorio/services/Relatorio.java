package com.relatorio.services;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.relatorio.model.Cliente;
import com.relatorio.model.Venda;
import com.relatorio.model.Vendedor;

public class Relatorio {

	private List<Venda> listaVendas;
	private List<Vendedor> listaVendedores;
	private List<Cliente> listaClientes;

	public Relatorio() {
		this.listaVendedores = new LinkedList<>();
		this.listaClientes = new LinkedList<>();
		this.listaVendas = new LinkedList<>();
	}

	public void adicionarVendedor(Vendedor vendedor) {
		listaVendedores.add(vendedor);
	}

	public void adicionarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	public void adicionarVenda(Venda venda) {
		listaVendas.add(venda);
	}

	public int getIdVendaMaisCara() {
		listaVendas.sort(Comparator.comparing(Venda::getPrecoTotal).reversed());
		return listaVendas.get(0).getIdVenda();
	}

	public String getPiorVendedor() {
		listaVendas.sort(Comparator.comparing(Venda::getPrecoTotal));
		return listaVendas.get(0).getNomeVendedor();
	}

	@Override
	public String toString() {
		return String.format(
				"Relatorio [Quantidade de clientes=%d, Quantidade de Vendedor=%d, ID da venda mais cara=%d, Pior Vendedor=%s]",
				listaClientes.size(), listaVendedores.size(), getIdVendaMaisCara(), getPiorVendedor());
	}

}
