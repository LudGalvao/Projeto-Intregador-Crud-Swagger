package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "local")
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "local_id", nullable = false)
	private Integer localId;
	
	@Column(name = "local_descricao")
	private String localDescricao;
	
	@ManyToOne
	@Column(name = "projeto_id", nullable = false)
	private Projeto projeto;

	public Integer getLocalId() {
		return localId;
	}

	public void setLocalId(Integer localId) {
		this.localId = localId;
	}

	public String getLocalDescricao() {
		return localDescricao;
	}

	public void setLocalDescricao(String localDescricao) {
		this.localDescricao = localDescricao;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
}
