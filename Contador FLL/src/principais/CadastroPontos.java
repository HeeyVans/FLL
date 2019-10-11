package principais;

import basicas.Missoes;
import interfaces.IRepositorioPontos;
import repositorios.RepositorioPontosArrayArquivo;

public class CadastroPontos {
	
	private IRepositorioPontos repositorio;

	public CadastroPontos() {		
				repositorio = RepositorioPontosArrayArquivo.getInstance();	
	}
	
	public void inserir(Missoes missoes) {
		repositorio.inserir(missoes);	
		}
	
	public Missoes procurar() {
		return repositorio.procurar();	
		}

}
