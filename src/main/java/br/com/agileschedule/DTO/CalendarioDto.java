package br.com.agileschedule.DTO;

import java.util.Calendar;

public class CalendarioDto {

	private Calendar date;
	private String descricao;

	public CalendarioDto() {
		super();
	}

	public CalendarioDto(Calendar date, String descricao) {
		super();
		this.date = date;
		this.descricao = descricao;
	}

	public Calendar getDate() {
		return date;
	}

	public String getDescricao() {
		return descricao;
	}

}
