package basicas;

import java.io.Serializable;

public class Missoes implements Serializable{
	
	private String m01Ponte;
	private String m01Bandeira1;
	private String m01Bandeira2;
	private String m02Abaixado;
	private String m02Sobre;
	private String m02Circulo;
	private String m03Ponte;
	private String m04Galho;
	private String m05GalhoGrande;
	private String m05GalhoPequeno;
	private int m05QtdModuloGrande;
	private int m05QtdModuloPequeno;
	private String m06;
	private String m07;
	private String m08Baixo;
	private String m08Equilibrado;
	private String m09;
	private int m09QtdViga;
	private String m10;
	private String m11Total;
	private String m11Parcial;
	private String m12CirculoTotalMesmaCor;
	private String m12CirculoTotalDiferenteCor;
	private int m12QtdNivelTotalMesmaCor;
	private int m12QtdNivelDiferenteCor;
	private String m13;
	private int m13Qtd;
	private String m14Um;
	private String m14Dois;
	private String m14Tres;
	private String m14Quatro;
	private String m14Cinco;
	private String m14Seis;
	
	public Missoes(String m01Ponte, String m01Bandeira1, String m01Bandeira2, String m02Abaixado, String m02Sobre,
			String m02Circulo, String m03Ponte, String m04Galho, String m05GalhoGrande, String m05GalhoPequeno,
			int m05QtdModuloGrande, int m05QtdModuloPequeno, String m06, String m07, String m08Baixo,
			String m08Equilibrado, String m09, int m09QtdViga, String m10, String m11Total, String m11Parcial,
			String m12CirculoTotalMesmaCor, String m12CirculoTotalDiferenteCor, int m12QtdNivelTotalMesmaCor,
			int m12QtdNivelDiferenteCor, String m13, int m13Qtd, String m14Um, String m14Dois, String m14Tres,
			String m14Quatro, String m14Cinco, String m14Seis) {
		
		this.m01Ponte = m01Ponte;
		this.m01Bandeira1 = m01Bandeira1;
		this.m01Bandeira2 = m01Bandeira2;
		this.m02Abaixado = m02Abaixado;
		this.m02Sobre = m02Sobre;
		this.m02Circulo = m02Circulo;
		this.m03Ponte = m03Ponte;
		this.m04Galho = m04Galho;
		this.m05GalhoGrande = m05GalhoGrande;
		this.m05GalhoPequeno = m05GalhoPequeno;
		this.m05QtdModuloGrande = m05QtdModuloGrande;
		this.m05QtdModuloPequeno = m05QtdModuloPequeno;
		this.m06 = m06;
		this.m07 = m07;
		this.m08Baixo = m08Baixo;
		this.m08Equilibrado = m08Equilibrado;
		this.m09 = m09;
		this.m09QtdViga = m09QtdViga;
		this.m10 = m10;
		this.m11Total = m11Total;
		this.m11Parcial = m11Parcial;
		this.m12CirculoTotalMesmaCor = m12CirculoTotalMesmaCor;
		this.m12CirculoTotalDiferenteCor = m12CirculoTotalDiferenteCor;
		this.m12QtdNivelTotalMesmaCor = m12QtdNivelTotalMesmaCor;
		this.m12QtdNivelDiferenteCor = m12QtdNivelDiferenteCor;
		this.m13 = m13;
		this.m13Qtd = m13Qtd;
		this.m14Um = m14Um;
		this.m14Dois = m14Dois;
		this.m14Tres = m14Tres;
		this.m14Quatro = m14Quatro;
		this.m14Cinco = m14Cinco;
		this.m14Seis = m14Seis;
	}

	public String getM01Ponte() {
		return m01Ponte;
	}

	public void setM01Ponte(String m01Ponte) {
		this.m01Ponte = m01Ponte;
	}

	public String getM01Bandeira1() {
		return m01Bandeira1;
	}

	public void setM01Bandeira1(String m01Bandeira1) {
		this.m01Bandeira1 = m01Bandeira1;
	}

	public String getM01Bandeira2() {
		return m01Bandeira2;
	}

	public void setM01Bandeira2(String m01Bandeira2) {
		this.m01Bandeira2 = m01Bandeira2;
	}

	public String getM02Abaixado() {
		return m02Abaixado;
	}

	public void setM02Abaixado(String m02Abaixado) {
		this.m02Abaixado = m02Abaixado;
	}

	public String getM02Sobre() {
		return m02Sobre;
	}

	public void setM02Sobre(String m02Sobre) {
		this.m02Sobre = m02Sobre;
	}

	public String getM02Circulo() {
		return m02Circulo;
	}

	public void setM02Circulo(String m02Circulo) {
		this.m02Circulo = m02Circulo;
	}

	public String getM03Ponte() {
		return m03Ponte;
	}

	public void setM03Ponte(String m03Ponte) {
		this.m03Ponte = m03Ponte;
	}

	public String getM04Galho() {
		return m04Galho;
	}

	public void setM04Galho(String m04Galho) {
		this.m04Galho = m04Galho;
	}

	public String getM05GalhoGrande() {
		return m05GalhoGrande;
	}

	public void setM05GalhoGrande(String m05GalhoGrande) {
		this.m05GalhoGrande = m05GalhoGrande;
	}

	public String getM05GalhoPequeno() {
		return m05GalhoPequeno;
	}

	public void setM05GalhoPequeno(String m05GalhoPequeno) {
		this.m05GalhoPequeno = m05GalhoPequeno;
	}

	public int getM05QtdModuloGrande() {
		return m05QtdModuloGrande;
	}

	public void setM05QtdModuloGrande(int m05QtdModuloGrande) {
		this.m05QtdModuloGrande = m05QtdModuloGrande;
	}

	public int getM05QtdModuloPequeno() {
		return m05QtdModuloPequeno;
	}

	public void setM05QtdModuloPequeno(int m05QtdModuloPequeno) {
		this.m05QtdModuloPequeno = m05QtdModuloPequeno;
	}

	public String getM06() {
		return m06;
	}

	public void setM06(String m06) {
		this.m06 = m06;
	}

	public String getM07() {
		return m07;
	}

	public void setM07(String m07) {
		this.m07 = m07;
	}

	public String getM08Baixo() {
		return m08Baixo;
	}

	public void setM08Baixo(String m08Baixo) {
		this.m08Baixo = m08Baixo;
	}

	public String getM08Equilibrado() {
		return m08Equilibrado;
	}

	public void setM08Equilibrado(String m08Equilibrado) {
		this.m08Equilibrado = m08Equilibrado;
	}

	public String getM09() {
		return m09;
	}

	public void setM09(String m09) {
		this.m09 = m09;
	}

	public int getM09QtdViga() {
		return m09QtdViga;
	}

	public void setM09QtdViga(int m09QtdViga) {
		this.m09QtdViga = m09QtdViga;
	}

	public String getM10() {
		return m10;
	}

	public void setM10(String m10) {
		this.m10 = m10;
	}

	public String getM11Total() {
		return m11Total;
	}

	public void setM11Total(String m11Total) {
		this.m11Total = m11Total;
	}

	public String getM11Parcial() {
		return m11Parcial;
	}

	public void setM11Parcial(String m11Parcial) {
		this.m11Parcial = m11Parcial;
	}

	public String getM12CirculoTotalMesmaCor() {
		return m12CirculoTotalMesmaCor;
	}

	public void setM12CirculoTotalMesmaCor(String m12CirculoTotalMesmaCor) {
		this.m12CirculoTotalMesmaCor = m12CirculoTotalMesmaCor;
	}

	public String getM12CirculoTotalDiferenteCor() {
		return m12CirculoTotalDiferenteCor;
	}

	public void setM12CirculoTotalDiferenteCor(String m12CirculoTotalDiferenteCor) {
		this.m12CirculoTotalDiferenteCor = m12CirculoTotalDiferenteCor;
	}

	public int getM12QtdNivelTotalMesmaCor() {
		return m12QtdNivelTotalMesmaCor;
	}

	public void setM12QtdNivelTotalMesmaCor(int m12QtdNivelTotalMesmaCor) {
		this.m12QtdNivelTotalMesmaCor = m12QtdNivelTotalMesmaCor;
	}

	public int getM12QtdNivelDiferenteCor() {
		return m12QtdNivelDiferenteCor;
	}

	public void setM12QtdNivelDiferenteCor(int m12QtdNivelDiferenteCor) {
		this.m12QtdNivelDiferenteCor = m12QtdNivelDiferenteCor;
	}

	public String getM13() {
		return m13;
	}

	public void setM13(String m13) {
		this.m13 = m13;
	}

	public int getM13Qtd() {
		return m13Qtd;
	}

	public void setM13Qtd(int m13Qtd) {
		this.m13Qtd = m13Qtd;
	}

	public String getM14Um() {
		return m14Um;
	}

	public void setM14Um(String m14Um) {
		this.m14Um = m14Um;
	}

	public String getM14Dois() {
		return m14Dois;
	}

	public void setM14Dois(String m14Dois) {
		this.m14Dois = m14Dois;
	}

	public String getM14Tres() {
		return m14Tres;
	}

	public void setM14Tres(String m14Tres) {
		this.m14Tres = m14Tres;
	}

	public String getM14Quatro() {
		return m14Quatro;
	}

	public void setM14Quatro(String m14Quatro) {
		this.m14Quatro = m14Quatro;
	}

	public String getM14Cinco() {
		return m14Cinco;
	}

	public void setM14Cinco(String m14Cinco) {
		this.m14Cinco = m14Cinco;
	}

	public String getM14Seis() {
		return m14Seis;
	}

	public void setM14Seis(String m14Seis) {
		this.m14Seis = m14Seis;
	}

}
