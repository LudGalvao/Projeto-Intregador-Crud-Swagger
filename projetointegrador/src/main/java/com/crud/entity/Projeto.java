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
@Table(name = "projeto")
public class Projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projeto_id", nullable = false)
	private Integer projetoId;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable = false)
	private Empresa empresa;
	
	@Column(name = "projeto_descricao")
	private String projetoDescricao;
	
	@Column(name = "projeto_data_inicio")
	private LocalDateTime projetoDataInicio;
	
	@Column(name = "projeto_data_fim")
	private LocalDateTime projetoDataFim;
	
	@Column(name = "projeto_orcamento")
	private Long projetoOrcamento;
	
	@Column(name = "projeto_status")
	private Integer projetoStatus;

	public Integer getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Integer projetoId) {
		this.projetoId = projetoId;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getProjetoDescricao() {
		return projetoDescricao;
	}

	public void setProjetoDescricao(String projetoDescricao) {
		this.projetoDescricao = projetoDescricao;
	}

	public LocalDateTime getProjetoDataInicio() {
		return projetoDataInicio;
	}

	public void setProjetoDataInicio(LocalDateTime projetoDataInicio) {
		this.projetoDataInicio = projetoDataInicio;
	}

	public LocalDateTime getProjetoDataFim() {
		return projetoDataFim;
	}

	public void setProjetoDataFim(LocalDateTime projetoDataFim) {
		this.projetoDataFim = projetoDataFim;
	}

	public Long getProjetoOrcamento() {
		return projetoOrcamento;
	}

	public void setProjetoOrcamento(Long projetoOrcamento) {
		this.projetoOrcamento = projetoOrcamento;
	}

	public Integer getProjetoStatus() {
		return projetoStatus;
	}

	public void setProjetoStatus(Integer projetoStatus) {
		this.projetoStatus = projetoStatus;
	}
	
	
 }
