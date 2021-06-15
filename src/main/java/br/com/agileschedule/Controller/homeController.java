package br.com.agileschedule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CompassoSquad3.HelpCalendar.Service.CalendarioService;

import br.com.agileschedule.Entity.Calendario;

@RestController
public class homeController {

	@Autowired
	private CalendarioService calenS;
	
	@RequestMapping(value = "agenda", method = RequestMethod.GET)
	public List<Calendario> listCalendario(){
		calenS.pegarTodos();
		
		return null;
	}
	
	
}
