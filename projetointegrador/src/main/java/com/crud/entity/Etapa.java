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
@Table(name = "Etapa")
public class Etapa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "etapa_id", nullable = false)
	private Integer etapaId;
	
	@Column(name = "etapa_descricao")
	private String etapaDescricao;
	
	@Column(name = "etapa_data_inicio")
	private LocalDateTime etapaDataInicio;
	
	@Column(name = "etapa_data_fim")
	private LocalDateTime etapaDataFim;
	
	@Column(name = "etapa_ordem")
	private Integer etapaOrdem;
	
	@Column(name = "etapa_status")
	private Integer etapaStatus;
	
	@ManyToOne
	@JoinColumn(name = "disciplina_id", nullable = false)
	private Disciplina disciplina;
	
	@OneToOne
	@JoinColumn(name = "etapa_id_pai", nullable = false)
	private Integer etapaIdPai;

	public Integer getEtapaId() {
		return etapaId;
	}

	public void setEtapaId(Integer etapaId) {
		this.etapaId = etapaId;
	}

	public String getEtapaDescricao() {
		return etapaDescricao;
	}

	public void setEtapaDescricao(String etapaDescricao) {
		this.etapaDescricao = etapaDescricao;
	}

	public LocalDateTime getEtapaDataInicio() {
		return etapaDataInicio;
	}

	public void setEtapaDataInicio(LocalDateTime etapaDataInicio) {
		this.etapaDataInicio = etapaDataInicio;
	}

	public LocalDateTime getEtapaDataFim() {
		return etapaDataFim;
	}

	public void setEtapaDataFim(LocalDateTime etapaDataFim) {
		this.etapaDataFim = etapaDataFim;
	}

	public Integer getEtapaOrdem() {
		return etapaOrdem;
	}

	public void setEtapaOrdem(Integer etapaOrdem) {
		this.etapaOrdem = etapaOrdem;
	}

	public Integer getEtapaStatus() {
		return etapaStatus;
	}

	public void setEtapaStatus(Integer etapaStatus) {
		this.etapaStatus = etapaStatus;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getEtapaIdPai() {
		return etapaIdPai;
	}

	public void setEtapaIdPai(Integer etapaIdPai) {
		this.etapaIdPai = etapaIdPai;
	}
	
	
}
