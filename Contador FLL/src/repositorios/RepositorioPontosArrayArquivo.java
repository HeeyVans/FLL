package repositorios;

import java.io.Serializable;

import basicas.Missoes;
import interfaces.IRepositorioPontos;

public class RepositorioPontosArrayArquivo implements IRepositorioPontos, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int TAM = 1;
	private Missoes[] repositorio;
	public static RepositorioPontosArrayArquivo instance;

	public Missoes[] getRepositorio() {
		return repositorio;
	}

	public RepositorioPontosArrayArquivo(){
		this.repositorio = new Missoes[TAM];
	}
	
	public static RepositorioPontosArrayArquivo getInstance() {
	    if (instance == null) {
	      instance = new RepositorioPontosArrayArquivo();
	    }
	    return instance;
	  }	
	
	@Override
	public void inserir(Missoes missoes) {
		repositorio[0] = missoes;		
	}
	
	public Missoes procurar() {
		return repositorio[0];
	}
}
