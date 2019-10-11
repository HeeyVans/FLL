package principais;

import basicas.Missoes;

public class Fachada {
	
	private static Fachada instance;
	private CadastroPontos missoes;
	
public Fachada() {
		
		missoes = new CadastroPontos();		
	}

public static Fachada getInstance(){
	
	if(instance == null){
		instance = new Fachada();
		return instance;
	}
	
	return instance;
	
}

//INICIO CRUD DE CLIENTE
	public void cadastrarPontos(Missoes missoes)  {
		this.missoes.inserir(missoes);
	}
	public Missoes procurarPontos()  {
		return this.missoes.procurar();
	}
//FIM DE CRUD PONTOS

}
