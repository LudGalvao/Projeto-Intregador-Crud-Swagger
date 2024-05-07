package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grupo_id", nullable = false)
	private Integer grupoId;
	
	@Column(name = "grupo_nome")
	private String grupoNome;
	
	@Column(name = "grupo_descricao")
	private String grupoDescricao;
	
	@Column(name = "grupo_status")
	private Integer grupoStatus;

	public Integer getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(Integer grupoId) {
		this.grupoId = grupoId;
	}

	public String getGrupoNome() {
		return grupoNome;
	}

	public void setGrupoNome(String grupoNome) {
		this.grupoNome = grupoNome;
	}

	public String getGrupoDescricao() {
		return grupoDescricao;
	}

	public void setGrupoDescricao(String grupoDescricao) {
		this.grupoDescricao = grupoDescricao;
	}

	public Integer getGrupoStatus() {
		return grupoStatus;
	}

	public void setGrupoStatus(Integer grupoStatus) {
		this.grupoStatus = grupoStatus;
	}
	
	
}
