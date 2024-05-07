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
@Table(name = "arquivo_tag")
public class ArquivoTag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_tag_id", nullable = false)
	private Integer arquivoTagId;
	
	 @ManyToOne
	 @JoinColumn(name = "arquivo_id", nullable = false)
	 private Arquivo arquivo;
	 
	 @ManyToOne
	 @JoinColumn(name = "tag_id", nullable = false)
	 private Tag tag;

	public Integer getArquivoTagId() {
		return arquivoTagId;
	}

	public void setArquivoTagId(Integer arquivoTagId) {
		this.arquivoTagId = arquivoTagId;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	 
	 
}
