package com.crud.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "arquivo_comentario")
public class ArquivoComentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_comentario", nullable = false)
	private Integer ArquivoComentarioId;
	
	@Column(name = "arquivo_comentario_descricao")
	private String ArquivoComentarioDescricao;
	
	@Column(name = "arquivo_comentario_markup")
	private Integer ArquivoComentarioMarkup;
	
	@ManyToOne
	@JoinColumn(name = "arquivo_id", nullable = false)
	private Arquivo arquivo;
	
	@OneToOne
	@JoinColumn(name = "arquivo_comentario_id_pai", nullable = false)
	private String arquivoComentarioIdPai;
	
	@Column(name = "arquivo_comentario_nivel")
	private String arquivoComentarioNivel;
	
	@Column(name = "arquivo_comentario_data")
	private LocalDateTime arquivoComentarioData;
	
	@Column(name = "arquivo_comentario_status")
	private Integer arquivoComentarioStatus;

	public Integer getArquivoComentarioId() {
		return ArquivoComentarioId;
	}

	public void setArquivoComentarioId(Integer arquivoComentarioId) {
		ArquivoComentarioId = arquivoComentarioId;
	}

	public String getArquivoComentarioDescricao() {
		return ArquivoComentarioDescricao;
	}

	public void setArquivoComentarioDescricao(String arquivoComentarioDescricao) {
		ArquivoComentarioDescricao = arquivoComentarioDescricao;
	}

	public Integer getArquivoComentarioMarkup() {
		return ArquivoComentarioMarkup;
	}

	public void setArquivoComentarioMarkup(Integer arquivoComentarioMarkup) {
		ArquivoComentarioMarkup = arquivoComentarioMarkup;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public String getArquivoComentarioIdPai() {
		return arquivoComentarioIdPai;
	}

	public void setArquivoComentarioIdPai(String arquivoComentarioIdPai) {
		this.arquivoComentarioIdPai = arquivoComentarioIdPai;
	}

	public String getArquivoComentarioNivel() {
		return arquivoComentarioNivel;
	}

	public void setArquivoComentarioNivel(String arquivoComentarioNivel) {
		this.arquivoComentarioNivel = arquivoComentarioNivel;
	}

	public LocalDateTime getArquivoComentarioData() {
		return arquivoComentarioData;
	}

	public void setArquivoComentarioData(LocalDateTime arquivoComentarioData) {
		this.arquivoComentarioData = arquivoComentarioData;
	}

	public Integer getArquivoComentarioStatus() {
		return arquivoComentarioStatus;
	}

	public void setArquivoComentarioStatus(Integer arquivoComentarioStatus) {
		this.arquivoComentarioStatus = arquivoComentarioStatus;
	}
	
	
	
}
