package br.com.agileschedule.Components;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.agileschedule.DTO.CalendarioDto;
import br.com.agileschedule.Entity.Calendario;

@Component
public class CalendarioConverter {
	
	
	public CalendarioDto calenDto (Calendario calendario) {
		CalendarioDto Dto = new CalendarioDto();
		Dto.setData(calendario.getData());
		Dto.setDescricao(calendario.getDescricao());
		return Dto;
	}
	

	public List<CalendarioDto> entidadeDto(List<Calendario> calen) {
		return calen.stream().map(x -> calenDto(x)).collect(Collectors.toList());
	}

	
	
	
	
}
