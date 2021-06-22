package br.com.agileschedule.Controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.agileschedule.Components.CalendarioConverter;
import br.com.agileschedule.DTO.CalendarioDto;
import br.com.agileschedule.Entity.Calendario;
import br.com.agileschedule.Form.CalendarioForm;
import br.com.agileschedule.Repository.CalendarioRepository;

@RestController("/")
public class homeController {
	
	@Autowired
	private CalendarioConverter convert;

	@Autowired
	private CalendarioRepository calendarioR;
	
	@GetMapping
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@GetMapping("/Calendario")
	public List<CalendarioDto> listCalendario(){
		List<Calendario> calen = calendarioR.findAll();
		return convert.entidadeDto(calen);
	}
	
	@PostMapping("newCalendar")
	public ResponseEntity<?> criarEvento(@RequestBody @Valid CalendarioForm calenForm,
			UriComponentsBuilder builder){
		try {
			Calendario calen = calenForm.toForm(calendarioR);
			URI uri = builder.path("Calendario/{id}").buildAndExpand(calen.getId()).toUri();
			return ResponseEntity.created(uri).body(new CalendarioDto().EntidDto(calen));
		}catch(DataIntegrityViolationException SQL){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não Foi Possivel Adicionar ao Calendario");
		}
	}
	
	
	
	
	
}
