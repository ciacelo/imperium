package br.com.imperium;

public class Exercicio {
	private String nome;
	private int id;
	/*
	 * Grupos musculares trabalhados por cada exercicio
	 * analisar a viabilidade do estrategy p o grupo muscular mudar de acordo com o exercicio
	 * https://www.feitodeiridium.com.br/melhores-exercicios-segundo-ciencia/
	 */
	private int repeticoes;
	private int descanso;
	
	public Exercicio() {
		this.nome = new String();
		this.repeticoes = 0;
		this.descanso = 0;
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

	public int getDescanso() {
		return descanso;
	}

	public void setDescanso(int descanso) {
		this.descanso = descanso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}