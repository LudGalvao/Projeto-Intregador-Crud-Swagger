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
@Table(name = "arquivo_comentario_tag")
public class ArquivoComentarioTag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_comentario_tag_id", nullable = false)
	private Integer arquivoComentarioTagId;
	
	@ManyToOne
	@JoinColumn(name = "arquivo_comentario_id", nullable = false)
	private ArquivoComentario arquivoComentario;
	
	@ManyToOne
	@JoinColumn(name = "tag_id", nullable = false)
	private Tag tag;

	public Integer getArquivoComentarioTagId() {
		return arquivoComentarioTagId;
	}

	public void setArquivoComentarioTagId(Integer arquivoComentarioTagId) {
		this.arquivoComentarioTagId = arquivoComentarioTagId;
	}

	public ArquivoComentario getArquivoComentario() {
		return arquivoComentario;
	}

	public void setArquivoComentario(ArquivoComentario arquivoComentario) {
		this.arquivoComentario = arquivoComentario;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	
	
	
}
