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
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id", nullable = false)
	private Integer usuarioId;
	
	@Column(name = "usuario_nome")
	private String usuarioNome;
	
	@Column(name = "usuario_email")
	private String usuarioEmail;
	
	@Column(name = "usuario_cpf")
	private String usuaripCpf;
	
	@Column(name = "usuario_cnpj")
	private String usuarioCnpj;
	
	@Column(name = "usuario_endereco")
	private String usuarioEndereco;
	
	@Column(name = "usuario_status")
	private Integer usuarioStatus;
	
	@Column(name = "usuario_cargo")
	private String usuarioCargo;
	
	@Column(name = "usuario_tipo")
	private Integer usuarioTipo;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable = false)
	private Empresa empresa;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public String getUsuaripCpf() {
		return usuaripCpf;
	}

	public void setUsuaripCpf(String usuaripCpf) {
		this.usuaripCpf = usuaripCpf;
	}

	public String getUsuarioCnpj() {
		return usuarioCnpj;
	}

	public void setUsuarioCnpj(String usuarioCnpj) {
		this.usuarioCnpj = usuarioCnpj;
	}

	public String getUsuarioEndereco() {
		return usuarioEndereco;
	}

	public void setUsuarioEndereco(String usuarioEndereco) {
		this.usuarioEndereco = usuarioEndereco;
	}

	public Integer getUsuarioStatus() {
		return usuarioStatus;
	}

	public void setUsuarioStatus(Integer usuarioStatus) {
		this.usuarioStatus = usuarioStatus;
	}

	public String getUsuarioCargo() {
		return usuarioCargo;
	}

	public void setUsuarioCargo(String usuarioCargo) {
		this.usuarioCargo = usuarioCargo;
	}

	public Integer getUsuarioTipo() {
		return usuarioTipo;
	}

	public void setUsuarioTipo(Integer usuarioTipo) {
		this.usuarioTipo = usuarioTipo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
