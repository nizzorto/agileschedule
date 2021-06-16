package br.com.agileschedule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.agileschedule.Components.CalendarioConverter;
import br.com.agileschedule.DTO.CalendarioDto;
import br.com.agileschedule.Entity.Calendario;
import br.com.agileschedule.Repository.CalendarioRepository;

@RestController
public class homeController {
	
	@Autowired
	private CalendarioConverter convert;

	@Autowired
	private CalendarioRepository calendarioR;
	
	@RequestMapping(value = "agenda", method = RequestMethod.GET)
	public List<CalendarioDto> listCalendario(){
		List<Calendario> calen = calendarioR.findAll();
		return convert.entidadeDto(calen);
	}
	
	
}
