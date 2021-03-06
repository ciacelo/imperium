package br.com.imperium;

public class ExameCorporal {
	private double peso;
	private double altura;
	private double panturrilhaDireita;
	private double panturrilhaEsquerda;
	private String data;
	private double torax;
	private double cintura;
	private double quadril;
	private double bracoEsquerdo;
	private double bracoDireito;
	private double antebracoEsquerdo;
	private double antebracoDireito;
	private double pescoco;
	private double coxaDireita;
	private double coxaEsquerda;
	private double imc;
	private double gluteo;
	

	public ExameCorporal() {
		this.peso = 0.0;
		this.altura = 0.0;
		this.panturrilhaDireita = 0.0;
		this.panturrilhaEsquerda = 0.0;
		this.data = "";
		this.torax = 0.0;
		this.cintura = 0.0;
		this.quadril = 0.0;
		this.bracoEsquerdo = 0.0;
		this.bracoDireito = 0.0;
		this.antebracoEsquerdo = 0.0;
		this.antebracoDireito = 0.0;
		this.pescoco = 0.0;
		this.coxaDireita = 0.0;
		this.coxaEsquerda = 0.0;
		this.imc = 0.0;
		this.gluteo = 0.0;
	}

	public double getPanturrilhaDireita() {
		return panturrilhaDireita;
	}

	public void setPanturrilhaDireita(double panturrilhaDireita) {
		this.panturrilhaDireita = panturrilhaDireita;
	}

	public double getPanturrilhaEsquerda() {
		return panturrilhaEsquerda;
	}

	public void setPanturrilhaEsquerda(double panturrilhaEsquerda) {
		this.panturrilhaEsquerda = panturrilhaEsquerda;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getBracoEsquerdo() {
		return bracoEsquerdo;
	}

	public void setBracoEsquerdo(double bracoEsquerdo) {
		this.bracoEsquerdo = bracoEsquerdo;
	}

	public double getBracoDireito() {
		return bracoDireito;
	}

	public void setBracoDireito(double bracoDireito) {
		this.bracoDireito = bracoDireito;
	}

	public double getAntebracoEsquerdo() {
		return antebracoEsquerdo;
	}

	public void setAntebracoEsquerdo(double antebracoEsquerdo) {
		this.antebracoEsquerdo = antebracoEsquerdo;
	}

	public double getAntebracoDireito() {
		return antebracoDireito;
	}

	public void setAntebracoDireito(double antebracoDireito) {
		this.antebracoDireito = antebracoDireito;
	}

	public double getCoxaDireita() {
		return coxaDireita;
	}

	public void setCoxaDireita(double coxaDireita) {
		this.coxaDireita = coxaDireita;
	}

	public double getCoxaEsquerda() {
		return coxaEsquerda;
	}

	public void setCoxaEsquerda(double coxaEsquerda) {
		this.coxaEsquerda = coxaEsquerda;
	}

	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}

	public void calcularImc() {
		double imc = this.peso / (this.altura * this.altura);
		this.imc = imc;
	}

	public double getGluteo() {
		return gluteo;
	}

	public void setGluteo(double gluteo) {
		this.gluteo = gluteo;
	}

	public double getTorax() {
		return torax;
	}

	public void setTorax(double torax) {
		this.torax = torax;
	}

	public double getCintura() {
		return cintura;
	}

	public void setCintura(double cintura) {
		this.cintura = cintura;
	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

	public double getPescoco() {
		return pescoco;
	}

	public void setPescoco(double pescoco) {
		this.pescoco = pescoco;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return this.peso+"#"+this.altura+"#"+this.panturrilhaDireita
				+"#"+this.panturrilhaEsquerda+"#"+this.data+"#"+this.torax+"#"
				+this.cintura + "#" + this.quadril + "#" + this.bracoEsquerdo + "#"
				+ this.bracoDireito + "#" + this.antebracoEsquerdo + "#" + this.antebracoDireito
				+ "#" + this.pescoco + "#" + this.coxaDireita + "#" + this.coxaEsquerda + "#"
				+ this.imc + "#" + this.gluteo;
	}
	

}
