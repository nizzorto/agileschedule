package br.com.agileschedule.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "date")
	private Calendario date;
	
	@Column(name = "descricao")
	private String descricao;
	
	public Calendario(Long id, Calendario date, String descricao) {
		super();
		this.id = id;
		this.date = date;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendario getDate() {
		return date;
	}

	public void setDate(Calendario date) {
		this.date = date;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
