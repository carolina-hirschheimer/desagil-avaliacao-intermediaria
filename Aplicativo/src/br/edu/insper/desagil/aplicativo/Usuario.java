package br.edu.insper.desagil.aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public Video postaVideo (int id, Produto produto) {
		Video video = new Video (id, this, produto);
		return video;
	}
	
	public int totalAvaliacoes () {
		int soma = 0;
		
		for (Video video: videos) {
		
			soma += video.mediaAvaliacoes();
			}
		
		return soma;
	}


}
