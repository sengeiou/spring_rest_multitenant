package com.mult.dataservice.ttr.model;

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
@Table(name = "ttr")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ttr {

	@Id
	@SequenceGenerator(name = "ttr_id_seq", sequenceName = "ttr_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ttr_id_seq")
	private Long id;

	private String datatype;

	@ManyToOne
	@JoinColumn(name = "ttr_base_id")
	@JsonIgnore
	private TtrBase ttrBase;

	@OneToOne(mappedBy = "ttr", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TtrNatural natural;

	@OneToOne(mappedBy = "ttr", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private TtrLegal legal;

	@Override
	public String toString() {
		return "Ttr [id=" + id + ", datatype=" + datatype + ", natural=" + natural + ", legal=" + legal + "]";
	}

	public Long getId() {
		return id;
	}

	public String getDatatype() {
		return datatype;
	}

	public TtrBase getTtrBase() {
		return ttrBase;
	}

	public TtrNatural getNatural() {
		return natural;
	}

	public TtrLegal getLegal() {
		return legal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public void setTtrBase(TtrBase ttrBase) {
		this.ttrBase = ttrBase;
	}

	public void setNatural(TtrNatural natural) {
		this.natural = natural;
	}

	public void setLegal(TtrLegal legal) {
		this.legal = legal;
	}

}
