package br.com.agileschedule.DTO;

import java.util.Calendar;

import br.com.agileschedule.Entity.Calendario;

public class CalendarioDto {

	private Calendar data;
	private String descricao;

	public CalendarioDto() {
		super();
	}

	public CalendarioDto(Calendar data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CalendarioDto EntidDto(Calendario calen) {
		CalendarioDto dto = new CalendarioDto();
		dto.setData(calen.getData());
		dto.setDescricao(calen.getDescricao());
		return dto;
	}

}
