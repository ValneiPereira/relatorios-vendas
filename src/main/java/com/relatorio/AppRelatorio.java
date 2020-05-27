package com.relatorio;

import java.io.IOException;

import com.relatorio.util.StreamDados;

public class AppRelatorio {

	public static void main(String[] args) throws IOException {

		StreamDados dados = new StreamDados();
		dados.extrairDados();
		dados.salvarDados();
		System.out.println("FIM");
	}
}