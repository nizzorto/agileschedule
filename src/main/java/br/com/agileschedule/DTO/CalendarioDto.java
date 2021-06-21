package br.com.agileschedule.DTO;

import java.util.Date;

import br.com.agileschedule.Entity.Calendario;


public class CalendarioDto {

	private Date data;
	private String descricao;

	public CalendarioDto() {
		super();
	}

	public CalendarioDto(Date data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setData(Date data) {
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
