package com.prova.entity;

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
	@Column(columnDefinition = "INT", name = "lista_compartilhada_id", nullable = false)
	private int id;
	
	@Column(columnDefinition = "VARCHAR", name = "lista_compartilhada_descricao", nullable = false)
	private String descricao;
	
	@Column(columnDefinition = "DATETIME", name = "lista_compartilhada_data", nullable = false)
	private LocalDateTime data;
	
	@Column(columnDefinition = "INT", name = "lista_compartilhada_status", nullable = false)
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
