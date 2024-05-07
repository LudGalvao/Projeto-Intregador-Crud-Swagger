package com.crud.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

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
@Table(name = "arquivo")
public class Arquivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_id", nullable = false)
	private String arquivoId;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@Column(name = "arquivo_descricao")
	private String arquivoDescricao;
	
	@Column(name = "arquivo_data")
	private LocalDateTime arquivoData;
	
	@Column(name = "arquivo_versao")
	private BigDecimal arquivoVersao;
	
	@Column(name = "arquivo_link")
	private String arquivoLink;
	
	@ManyToOne
	@JoinColumn(name = "local_int", nullable = false)
	private Local local;
	
	@ManyToOne
	@JoinColumn(name = "projeto_id", nullable = false)
	private Projeto projeto;
	
	@ManyToOne
	@JoinColumn(name = "etapa_id", nullable = false)
	private Etapa etapa;
	
	@OneToOne
	@JoinColumn(name = "arquivo_id_pai", nullable = false)
	private String arquivoPai;

	public String getArquivoId() {
		return arquivoId;
	}

	public void setArquivoId(String arquivoId) {
		this.arquivoId = arquivoId;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getArquivoDescricao() {
		return arquivoDescricao;
	}

	public void setArquivoDescricao(String arquivoDescricao) {
		this.arquivoDescricao = arquivoDescricao;
	}

	public LocalDateTime getArquivoData() {
		return arquivoData;
	}

	public void setArquivoData(LocalDateTime arquivoData) {
		this.arquivoData = arquivoData;
	}

	public BigDecimal getArquivoVersao() {
		return arquivoVersao;
	}

	public void setArquivoVersao(BigDecimal arquivoVersao) {
		this.arquivoVersao = arquivoVersao;
	}

	public String getArquivoLink() {
		return arquivoLink;
	}

	public void setArquivoLink(String arquivoLink) {
		this.arquivoLink = arquivoLink;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public String getArquivoPai() {
		return arquivoPai;
	}

	public void setArquivoPai(String arquivoPai) {
		this.arquivoPai = arquivoPai;
	}
	
	
	
}
