package com.crud.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "relatorio")
public class Relatorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "relatorio_id", nullable = false)
	private Integer relatorio_id;
	
	@Column(name = "relatorio_descricao")
	private String relatorioDescricao;
	
	@Column(name = "relatorio_tipo")
	private String relatorioTipo;
	
	@Column(name = "relatorio_json")
	private String relatorioJson;
	
	@Column(name = "relatorio_titulo")
	private String relatorioTitulo;
	
	@Column(name = "relatorio_status")
	private Integer relatorioStatus;
	
	@Column(name = "relatorio_data")
	private LocalDateTime relatorioData;
	
	@Column(name = "projeto_id")
	private Projeto projeto;

	public Integer getRelatorio_id() {
		return relatorio_id;
	}

	public void setRelatorio_id(Integer relatorio_id) {
		this.relatorio_id = relatorio_id;
	}

	public String getRelatorioDescricao() {
		return relatorioDescricao;
	}

	public void setRelatorioDescricao(String relatorioDescricao) {
		this.relatorioDescricao = relatorioDescricao;
	}

	public String getRelatorioTipo() {
		return relatorioTipo;
	}

	public void setRelatorioTipo(String relatorioTipo) {
		this.relatorioTipo = relatorioTipo;
	}

	public String getRelatorioJson() {
		return relatorioJson;
	}

	public void setRelatorioJson(String relatorioJson) {
		this.relatorioJson = relatorioJson;
	}

	public String getRelatorioTitulo() {
		return relatorioTitulo;
	}

	public void setRelatorioTitulo(String relatorioTitulo) {
		this.relatorioTitulo = relatorioTitulo;
	}

	public Integer getRelatorioStatus() {
		return relatorioStatus;
	}

	public void setRelatorioStatus(Integer relatorioStatus) {
		this.relatorioStatus = relatorioStatus;
	}

	public LocalDateTime getRelatorioData() {
		return relatorioData;
	}

	public void setRelatorioData(LocalDateTime relatorioData) {
		this.relatorioData = relatorioData;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
}
