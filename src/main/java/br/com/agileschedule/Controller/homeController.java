package br.com.agileschedule.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.agileschedule.Components.CalendarioConverter;
import br.com.agileschedule.DTO.CalendarioDto;
import br.com.agileschedule.Entity.Calendario;
import br.com.agileschedule.Form.CalendarioForm;
import br.com.agileschedule.Repository.CalendarioRepository;
import javassist.NotFoundException;

@Controller("/")
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
	public List<CalendarioDto> listCalendario() {
		List<Calendario> calen = calendarioR.findAll();
		return convert.entidadeDto(calen);
	}

	@PostMapping("newCalendar")
	public ResponseEntity<?> criarEvento(@RequestBody @Valid CalendarioForm calenForm, UriComponentsBuilder builder) {
		try {
			Calendario calen = calenForm.toForm(calendarioR);
			URI uri = builder.path("Calendario/{id}").buildAndExpand(calen.getId()).toUri();
			return ResponseEntity.created(uri).body(new CalendarioDto().EntidDto(calen));
		} catch (DataIntegrityViolationException SQL) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não Foi Possivel Adicionar ao Calendario");
		}
	}

	// !!!! testar o método !!!!
	@PutMapping("/Calendario/${id}")
	public ResponseEntity<?> atualizarEvento(@PathVariable(value = "id") Long id,
			@Valid @RequestBody CalendarioForm calendario) throws NotFoundException {

		// esperando atualizar o objeto Calendario
		Calendario calen = calendarioR.findById(id).orElseThrow(() -> new NotFoundException("Evento não encontrado!"));

		calen.setData(calendario.getData());
		calen.setDescricao(calendario.getDescricao());

		// retornar convertendo o Objeto Calendario para Dto
		return null;
	}

	// !!!! testar o método !!!!
	@DeleteMapping("/Calendario/${id}")
	public ResponseEntity<?> deletarEvento(@PathVariable(value = "id") Long id) throws NotFoundException {

		// esperando atualizar o objeto Calendario
		Calendario calen = calendarioR.findById(id).orElseThrow(() -> new NotFoundException("Evento não encontrado!"));

		// deletando
		calendarioR.delete(calen);

		// retornar convertendo o Objeto Calendario para Dto
		return null;
	}
}
