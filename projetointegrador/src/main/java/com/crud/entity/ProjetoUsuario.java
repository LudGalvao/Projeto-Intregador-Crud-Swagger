package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "projeto_usuario")
public class ProjetoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projeto_usuario_id", nullable = false)
	private Integer projetoUsuarioId;
	
	@Column(name = "projeto_usuario_status")
	private Integer projetoUsuarioStatus;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "projeto_id", nullable = false)
	private Projeto projeto;

	public Integer getProjetoUsuarioId() {
		return projetoUsuarioId;
	}

	public void setProjetoUsuarioId(Integer projetoUsuarioId) {
		this.projetoUsuarioId = projetoUsuarioId;
	}

	public Integer getProjetoUsuarioStatus() {
		return projetoUsuarioStatus;
	}

	public void setProjetoUsuarioStatus(Integer projetoUsuarioStatus) {
		this.projetoUsuarioStatus = projetoUsuarioStatus;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
	
}
