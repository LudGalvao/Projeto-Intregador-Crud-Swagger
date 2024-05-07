package com.crud.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_compartilhada")
public class ListaCompartilhada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lista_compartilhada_id", nullable = false)
	private Integer listaCompartilhadaId;
	
	@Column(name = "lista_compartilhada_descricao")
	private String listaCompartilhadaDescricao;
	
	@Column(name = "lista_compartilhada_data")
	private LocalDateTime listaCompartilhadaData;
	
	@Column(name = "lista_compartilhada_status")
	private Integer listaCompartilhadaStatus;

	public Integer getListaCompartilhadaId() {
		return listaCompartilhadaId;
	}

	public void setListaCompartilhadaId(Integer listaCompartilhadaId) {
		this.listaCompartilhadaId = listaCompartilhadaId;
	}

	public String getListaCompartilhadaDescricao() {
		return listaCompartilhadaDescricao;
	}

	public void setListaCompartilhadaDescricao(String listaCompartilhadaDescricao) {
		this.listaCompartilhadaDescricao = listaCompartilhadaDescricao;
	}

	public LocalDateTime getListaCompartilhadaData() {
		return listaCompartilhadaData;
	}

	public void setListaCompartilhadaData(LocalDateTime listaCompartilhadaData) {
		this.listaCompartilhadaData = listaCompartilhadaData;
	}

	public Integer getListaCompartilhadaStatus() {
		return listaCompartilhadaStatus;
	}

	public void setListaCompartilhadaStatus(Integer listaCompartilhadaStatus) {
		this.listaCompartilhadaStatus = listaCompartilhadaStatus;
	}
	
	
}
