package br.edu.insper.desagil.aplicativo;

import java.util.HashMap;
import java.util.Map;

public class Video {
	
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String,Integer> avaliacoes;
	int soma = 0;
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return id;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void adicionaAvaliacao (Usuario usuario, int nota) {
		if (usuario.getNome() != this.usuario.getNome()) {
			if (nota >=1 && nota<=5) {
				this.avaliacoes.put(usuario.getNome(), nota);
			}
		}
	}
	
	public int mediaAvaliacoes() {
		
		if (this.avaliacoes.size()==0) {
			return 0;
		}
		
		else {
			
			for (int nota: avaliacoes.values()) {
				soma += nota;
			}
			
			int media = (int) Math.round((soma/(this.avaliacoes).size()));
			return media;
		}
		
	}
	

}
