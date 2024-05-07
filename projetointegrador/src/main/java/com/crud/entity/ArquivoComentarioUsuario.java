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
@Table(name = "arquivo_comentario_usuario")
public class ArquivoComentarioUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_comentario_usuario_id", nullable = false)
	private Integer arquivoComentarioUsuarioId;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "arquivo_comentario_id", nullable = false)
	private ArquivoComentario arquivoComentario;

	public Integer getArquivoComentarioUsuarioId() {
		return arquivoComentarioUsuarioId;
	}

	public void setArquivoComentarioUsuarioId(Integer arquivoComentarioUsuarioId) {
		this.arquivoComentarioUsuarioId = arquivoComentarioUsuarioId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArquivoComentario getArquivoComentario() {
		return arquivoComentario;
	}

	public void setArquivoComentario(ArquivoComentario arquivoComentario) {
		this.arquivoComentario = arquivoComentario;
	}
	
	
}
