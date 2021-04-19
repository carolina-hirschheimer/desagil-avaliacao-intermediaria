package br.edu.insper.desagil.aplicativo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AplicativoTest {
	private static double DELTA = 0.01;

	private Usuario usuario;
	private Produto produto;

	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Carol");
		produto = new Produto ("Escova",10);
	}

	@Test
	public void avaliacoesInvalidas() {
		
		Video video = usuario.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario, 0);
		video.adicionaAvaliacao(usuario, 7);

		assertEquals(0, video.mediaAvaliacoes(), DELTA);
	}
	
	@Test
	public void umaAvaliacaoValida() {
		
		Video video = usuario.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario, 2);
		
		assertEquals(2, usuario.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void duasAvaliacoesValidas() {
		
		Video video = usuario.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario, 2);
		video.adicionaAvaliacao(usuario, 3);
		
		assertEquals(3, usuario.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void tresAvaliacoesValidas() {
		
		Video video = usuario.postaVideo(1, produto);
		
		video.adicionaAvaliacao(usuario, 2);
		video.adicionaAvaliacao(usuario, 2);
		video.adicionaAvaliacao(usuario, 3);
		
		assertEquals(2, usuario.totalAvaliacoes(), DELTA);
	}
	
	@Test
	public void doisVideos() {
		
		Video videoA = usuario.postaVideo(1, produto);
		
		videoA.adicionaAvaliacao(usuario, 2);
		videoA.adicionaAvaliacao(usuario, 2);
		
		Video videoB = usuario.postaVideo(2, produto);
		
		videoB.adicionaAvaliacao(usuario, 3);
		
		assertEquals(3, usuario.totalAvaliacoes(), DELTA);
	}
	
}
