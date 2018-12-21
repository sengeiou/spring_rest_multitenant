package com.mult.dataservice.str.model;

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
@Table(name = "str_base")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StrBase {
	@Id
	@SequenceGenerator(name = "str_base_id_seq", sequenceName = "str_base_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "str_base_id_seq")
	private Long id;

	@OneToMany(mappedBy = "strBase", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Str> str = new HashSet<>();

	private boolean updated;

	@Override
	public String toString() {
		return "StrBase [id=" + id + ", str=" + str + ", updated=" + updated + "]";
	}

	public Long getId() {
		return id;
	}

	public Set<Str> getStr() {
		return str;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStr(Set<Str> str) {
		this.str = str;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

}
