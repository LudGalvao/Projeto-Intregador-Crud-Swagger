package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "disciplina_id", nullable = false)
	private Integer disciplinaId;
	
	@Column(name = "disciplina_descricao")
	private String disciplinaDescricao;
	
	@Column(name = "disciplina_status")
	private Integer disciplinaStatus;
	
	@Column(name = "projeto_id")
	private Projeto projeto;

	public Integer getDisciplinaId() {
		return disciplinaId;
	}

	public void setDisciplinaId(Integer disciplinaId) {
		this.disciplinaId = disciplinaId;
	}

	public String getDisciplinaDescricao() {
		return disciplinaDescricao;
	}

	public void setDisciplinaDescricao(String disciplinaDescricao) {
		this.disciplinaDescricao = disciplinaDescricao;
	}

	public Integer getDisciplinaStatus() {
		return disciplinaStatus;
	}

	public void setDisciplinaStatus(Integer disciplinaStatus) {
		this.disciplinaStatus = disciplinaStatus;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
}
