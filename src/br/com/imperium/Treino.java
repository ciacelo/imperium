package br.com.imperium;

import java.util.List;

public class Treino {
	private List<Exercicio> exercicios;
	private Dia dia;

	public void excluirExercicio(int id) {
		for (Exercicio e : this.exercicios) {
			if (e.getId() == id) {
				this.exercicios.remove(e);
			}
		}
	}

	public Treino(List<Exercicio> exercicios, Dia dia) {
		this.setExercicios(exercicios);
		this.setDia(dia);
	}

	public List<Exercicio> imprimirExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

}
