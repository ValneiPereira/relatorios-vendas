package com.relatorio.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import com.relatorio.model.Cliente;
import com.relatorio.model.Item;
import com.relatorio.model.Venda;
import com.relatorio.model.Vendedor;
import com.relatorio.services.Relatorio;

public class StreamDados {

	private static final String COD_VENDEDOR_001 = "001";
	private static final String COD_CLIENTE_002 = "002";
	private static final String COD_VENDA_003 = "003";
	Relatorio relatorio = new Relatorio();

	public Relatorio extrairDados() throws IOException {
 
		Path path = FileSystems.getDefault().getPath("C:\\HOMEPATH\\data\\in\\teste.txt");
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] campo = linha.split("ç");
				String codDados = campo[0];
				
				if (codDados.equals(COD_VENDEDOR_001)) {
					Vendedor vendedor = new Vendedor(campo[1], campo[2], new BigDecimal(campo[3]));					
					relatorio.adicionarVendedor(vendedor);

				} else if (codDados.equals(COD_CLIENTE_002)) {
					Cliente cliente = new Cliente(campo[1], campo[2], campo[3]);
					relatorio.adicionarCliente(cliente);

				} else if (codDados.equals(COD_VENDA_003)) {
					Venda venda = new Venda();
					venda.setIdVenda(Integer.valueOf(campo[1]));

					String itenVenda = campo[2];
					String itensSemColchete = itenVenda.replaceAll("\\[", "").replaceAll("\\]", "");
					List<String> itens = Arrays.asList(itensSemColchete.split(","));
 
					for (String compra : itens) {
						Item item = new Item();
						String[] valores = compra.split("-");
						item.setCodItem(Integer.valueOf(valores[0]));
						item.setQtda(Integer.valueOf(valores[1]));
						item.setPreco(new BigDecimal(valores[2]));
						venda.adicionarItem(item);
					}

					venda.setNomeVendedor(campo[3]);
					relatorio.adicionarVenda(venda);

				} else {
					System.out.println("Arquivo nao tem codigo de valido");
				}

			}
		} catch (IOException e) {
			System.out.println("Erro ao encontrar arquivo: " + e.getMessage());
		}

		System.out.println(relatorio);
		return relatorio;
	}

	public void salvarDados() throws IOException {
	    String[] lines = new String[] {relatorio.toString()};
	    String  caminho ="C:\\HOMEPATH\\data\\out\\RELATORIO.txt";
	    try(BufferedWriter bufWriter = new BufferedWriter(new FileWriter(caminho, true))) {
	      for(String linha:lines) {
	        bufWriter.write(linha);
	        bufWriter.newLine();
	      }
	      
	    } catch (IOException excecao) {
	      System.out.println("Erro ao encontrar caminho especificado: " + excecao.getMessage());
	    }
	     
	  }
}