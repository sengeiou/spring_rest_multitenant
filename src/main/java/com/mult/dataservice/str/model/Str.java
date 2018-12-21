package com.mult.dataservice.str.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "str")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Str {

	@Id
	@SequenceGenerator(name = "str_id_seq", sequenceName = "str_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "str_id_seq")
	private Long id;

	private String datatype;

	@ManyToOne
	@JoinColumn(name = "str_base_id")
	@JsonIgnore
	private StrBase strBase;

	@OneToOne(mappedBy = "str", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private StrNatural natural;

	@OneToOne(mappedBy = "str", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private StrLegal legal;

	@Override
	public String toString() {
		return "Str [id=" + id + ", datatype=" + datatype + ", natural=" + natural + ", legal=" + legal + "]";
	}

	public Long getId() {
		return id;
	}

	public String getDatatype() {
		return datatype;
	}

	public StrBase getStrBase() {
		return strBase;
	}

	public StrNatural getNatural() {
		return natural;
	}

	public StrLegal getLegal() {
		return legal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public void setStrBase(StrBase strBase) {
		this.strBase = strBase;
	}

	public void setNatural(StrNatural natural) {
		this.natural = natural;
	}

	public void setLegal(StrLegal legal) {
		this.legal = legal;
	}

}
