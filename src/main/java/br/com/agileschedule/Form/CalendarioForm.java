package br.com.agileschedule.Form;

import java.util.Calendar;
import java.util.Date;

import javax.validation.constraints.NotNull;

import br.com.agileschedule.Entity.Calendario;
import br.com.agileschedule.Repository.CalendarioRepository;

public class CalendarioForm {

	@NotNull
	private Calendar data;

	@NotNull
	private String descricao;

	public CalendarioForm() {
		super();
	}

	public CalendarioForm(Calendar data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public void setDate(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendario toForm(CalendarioRepository calendarioR) {
		Calendario calen = new Calendario(data, descricao);
		calendarioR.save(calen);
		return calen;
	}

}
