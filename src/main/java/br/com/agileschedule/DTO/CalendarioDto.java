package br.com.agileschedule.DTO;

import java.time.LocalDate;
import java.time.LocalTime;


public class CalendarioDto {

	private LocalDate diaInicial;
	
	private LocalDate diaFinal;
	
	private LocalTime hrInicial;
	
	private LocalTime hrFinal;
	
	private String descricao;
	
	

	public CalendarioDto() {
		super();
	}

	public CalendarioDto(LocalDate diaInicial, LocalDate diaFinal, LocalTime hrInicial, LocalTime hrFinal,
			String descricao) {
		super();
		this.diaInicial = diaInicial;
		this.diaFinal = diaFinal;
		this.hrInicial = hrInicial;
		this.hrFinal = hrFinal;
		this.descricao = descricao;
	}

	public LocalDate getDiaInicial() {
		return diaInicial;
	}

	public LocalDate getDiaFinal() {
		return diaFinal;
	}

	public LocalTime getHrInicial() {
		return hrInicial;
	}

	public LocalTime getHrFinal() {
		return hrFinal;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	

}
