package com.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empresa_id", nullable = false)
	private Integer empresaId;
	
	@Column(name = "empresa_nome")
	private String empresaNome;
	
	@Column(name = "empresa_cnpj")
	private String empresaCnpj;

	public Integer getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}

	public String getEmpresaNome() {
		return empresaNome;
	}

	public void setEmpresaNome(String empresaNome) {
		this.empresaNome = empresaNome;
	}

	public String getEmpresaCnpj() {
		return empresaCnpj;
	}

	public void setEmpresaCnpj(String empresaCnpj) {
		this.empresaCnpj = empresaCnpj;
	}
	
	
}
