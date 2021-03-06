package br.com.imperium;

public class Exercicio {
	private String nome;

	/*
	 * Grupos musculares trabalhados por cada exercicio analisar a viabilidade do
	 * estrategy p o grupo muscular mudar de acordo com o exercicio
	 * https://www.feitodeiridium.com.br/melhores-exercicios-segundo-ciencia/
	 */
	private int repeticoes;
	private int series;
	private double peso;
	private String aparelho;

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public Exercicio() {
		this.nome = new String();
		this.repeticoes = 0;
		this.series = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public String toString() {

		return "Nome: " + this.getNome() + " - Número de séries: " + this.getSeries() + " - Numero repeti��es: "
				+ this.getRepeticoes();

	}

}
