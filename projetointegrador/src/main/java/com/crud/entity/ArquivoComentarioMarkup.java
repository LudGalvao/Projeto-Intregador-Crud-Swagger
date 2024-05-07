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
@Table(name = "arquivo_comentario_markup")
public class ArquivoComentarioMarkup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_comentario_markup", nullable = false)
	private Integer arquivoComentarioMarkupId;
	
	@Column(name = "arquivo_comentario_markup_link_s3")
	private String arquivoComentarioMarkupLinkS3;
	
	@Column(name = "arquivo_comentario_markup_descricao")
	private String arquivoComentarioMarkupDescricao;
	
	@Column(name = "arquivo_comentario_markup_data")
	private LocalDateTime arquivoComentarioMarkupData;
	
	@ManyToOne
	@JoinColumn(name = "arquivo_comentario_id")
	private ArquivoComentario arquivoComentario;

	public Integer getArquivoComentarioMarkupId() {
		return arquivoComentarioMarkupId;
	}

	public void setArquivoComentarioMarkupId(Integer arquivoComentarioMarkupId) {
		this.arquivoComentarioMarkupId = arquivoComentarioMarkupId;
	}

	public String getArquivoComentarioMarkupLinkS3() {
		return arquivoComentarioMarkupLinkS3;
	}

	public void setArquivoComentarioMarkupLinkS3(String arquivoComentarioMarkupLinkS3) {
		this.arquivoComentarioMarkupLinkS3 = arquivoComentarioMarkupLinkS3;
	}

	public String getArquivoComentarioMarkupDescricao() {
		return arquivoComentarioMarkupDescricao;
	}

	public void setArquivoComentarioMarkupDescricao(String arquivoComentarioMarkupDescricao) {
		this.arquivoComentarioMarkupDescricao = arquivoComentarioMarkupDescricao;
	}

	public LocalDateTime getArquivoComentarioMarkupData() {
		return arquivoComentarioMarkupData;
	}

	public void setArquivoComentarioMarkupData(LocalDateTime arquivoComentarioMarkupData) {
		this.arquivoComentarioMarkupData = arquivoComentarioMarkupData;
	}

	public ArquivoComentario getArquivoComentario() {
		return arquivoComentario;
	}

	public void setArquivoComentario(ArquivoComentario arquivoComentario) {
		this.arquivoComentario = arquivoComentario;
	}
	
	
}
