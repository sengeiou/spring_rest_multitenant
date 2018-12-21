package com.mult.dataservice.ttr.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ttr_base")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TtrBase {
	@Id
	@SequenceGenerator(name = "ttr_base_id_seq", sequenceName = "ttr_base_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ttr_base_id_seq")
	private Long id;

	@OneToMany(mappedBy = "ttrBase", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Ttr> ttr = new HashSet<>();

	private boolean updated;

	@Override
	public String toString() {
		return "TtrBase [id=" + id + ", ttr=" + ttr + ", updated=" + updated + "]";
	}

	public Long getId() {
		return id;
	}

	public Set<Ttr> getTtr() {
		return ttr;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTtr(Set<Ttr> ttr) {
		this.ttr = ttr;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

}
