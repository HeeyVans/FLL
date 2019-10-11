package principais;

import javax.swing.JOptionPane;

import basicas.Missoes;

public class Teste {

	public static void main(String[] args) {
		
		Missoes missoes1 = new Missoes("S","S","S","S","S","S","S","S","S","S",0,0,"S","S","S","S","S",0,
				"S","S","S","S","S",0,0,"S",0,"S","S","S","S","S","S");
		Fachada.getInstance().cadastrarPontos(missoes1);
		
		Missoes missao2;
		missao2 = Fachada.getInstance().procurarPontos();
		
		if(missao2 != null) {
			JOptionPane.showMessageDialog(null, "Diferente");
		}else {
			JOptionPane.showMessageDialog(null, "Igual");
		}
	}

}
