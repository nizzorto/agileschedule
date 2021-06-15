package br.com.agileschedule.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agilechedule.Repository.CalendarioRepository;
import br.com.agileschedule.Entity.Calendario;

@Service
public class CalendarioService {

	@Autowired
	private CalendarioRepository calenR;
	
	public List<Calendario> pegarTodos() {
		List<Calendario> calen = new ArrayList<Calendario>();
		calen = calenR.findAll();
		
		return calen; 
	}

}
