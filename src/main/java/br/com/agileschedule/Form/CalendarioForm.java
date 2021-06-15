package br.com.agileschedule.Form;

import java.util.Calendar;

public class CalendarioForm {

	private Calendar date;
	private String descricao;
	
	
	
	public CalendarioForm() {
		super();
	}
	public CalendarioForm(Calendar date, String descricao) {
		super();
		this.date = date;
		this.descricao = descricao;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
