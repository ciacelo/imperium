package br.com.imperium;

import java.util.ArrayList;
import java.util.List;

import br.com.imperium.exceptions.AlunoNaoExisteException;

public class Instrutor extends Pessoa {

	private List<Aluno> alunos;

	public Instrutor(String nome, String dataDeNascimento, String dataDocadastro, String sexo, Endereco endereco,
			String email, String telefone, List<Aluno> alunos) {
		super(nome, dataDeNascimento, dataDocadastro, sexo, endereco, email, telefone);
		this.alunos = alunos;
	}
	public void addAluno(Aluno al) {
		this.alunos.add(al);
	}

	public Instrutor() {
		super("", "", "", "", new Endereco(), "", "");
		this.alunos = new ArrayList<Aluno>();
	}


	public int getQuantidadeDeAlunos() {
		return alunos.size();
	}

	public Aluno getAluno(int matricula) throws Exception {
		for (Aluno a : this.alunos) {
			if (a.getMatricula() == matricula) {
				return a;
			}
		}
		throw new AlunoNaoExisteException("O aluno pesquisado não existe no sistema.");
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	public String toStringModeloArquivo() {
		String texto = getNome() + "#" + getDataDeNascimento() + "#" + getDataDocadastro() + "#" + getSexo() + "#"
				+ "#" + getEmail() + "#" + getTelefone() + "#"+getEndereco().toString()+"#"+this.alunos.size()+"#";
		for(Aluno al: this.alunos) {
			texto+=al.getMatricula()+"#";
		}
		
		return texto;
	}

}
