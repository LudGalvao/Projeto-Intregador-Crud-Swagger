package com.crud.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notificacao")
public class Notificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "notificacao_id", nullable = false)
	private Integer notificacaoId;
	
	@Column(name = "notificacao_titulo")
	private String notificacaoTitulo;
	
	@Column(name = "notificacao_descricao")
	private String notificacaoDescricao;
	
	@Column(name = "notificacao_tipo")
	private Integer notificacaoTipo;
	
	@Column(name = "notificacao_data")
	private LocalDateTime notificacaoData;
	
	@Column(name = "notificacao_status")
	private Integer notificacaoStatus;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Integer getNotificacaoId() {
		return notificacaoId;
	}

	public void setNotificacaoId(Integer notificacaoId) {
		this.notificacaoId = notificacaoId;
	}

	public String getNotificacaoTitulo() {
		return notificacaoTitulo;
	}

	public void setNotificacaoTitulo(String notificacaoTitulo) {
		this.notificacaoTitulo = notificacaoTitulo;
	}

	public String getNotificacaoDescricao() {
		return notificacaoDescricao;
	}

	public void setNotificacaoDescricao(String notificacaoDescricao) {
		this.notificacaoDescricao = notificacaoDescricao;
	}

	public Integer getNotificacaoTipo() {
		return notificacaoTipo;
	}

	public void setNotificacaoTipo(Integer notificacaoTipo) {
		this.notificacaoTipo = notificacaoTipo;
	}

	public LocalDateTime getNotificacaoData() {
		return notificacaoData;
	}

	public void setNotificacaoData(LocalDateTime notificacaoData) {
		this.notificacaoData = notificacaoData;
	}

	public Integer getNotificacaoStatus() {
		return notificacaoStatus;
	}

	public void setNotificacaoStatus(Integer notificacaoStatus) {
		this.notificacaoStatus = notificacaoStatus;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
