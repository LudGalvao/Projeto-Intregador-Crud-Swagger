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
@Table(name = "permissionamento")
public class Permissionamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "permissionamento_id", nullable = false)
	private String permissionamentoId;
	
	@ManyToOne
	@JoinColumn(name = "projeto_id", nullable = false)
	private Projeto projeto;
	
	@ManyToOne
	@JoinColumn(name = "disciplina_id", nullable = false)
	private Disciplina disciplina;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id", nullable = false)
	private Grupo grupo;
	
	@Column(name = "permissionamento_tipo")
	private String permissionamentoTipo;
	
	@ManyToOne
	@JoinColumn(name = "arquivo_id", nullable = false)
	private Arquivo arquivo;
	
	@ManyToOne
	@JoinColumn(name = "etapa_id", nullable = false)
	private Etapa etapa;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	public String getPermissionamentoId() {
		return permissionamentoId;
	}

	public void setPermissionamentoId(String permissionamentoId) {
		this.permissionamentoId = permissionamentoId;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getPermissionamentoTipo() {
		return permissionamentoTipo;
	}

	public void setPermissionamentoTipo(String permissionamentoTipo) {
		this.permissionamentoTipo = permissionamentoTipo;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
