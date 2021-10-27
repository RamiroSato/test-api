package ar.com.integral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.integral.service.MensajeCabeceraService;
import ar.com.integral.domain.MensajeCabecera;

@RestController
@RequestMapping("/cabeceras")
public class MensajeCabController {
	@Autowired
	private MensajeCabeceraService mensajeCabeceraService;
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public MensajeCabecera getMensajeCabecera(@PathVariable("id") String id) {
		return mensajeCabeceraService.get(Long.parseLong(id));
	}

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public List<MensajeCabecera> getMensajeCabeceras() {
		return mensajeCabeceraService.getAll();
	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public MensajeCabecera createMensajeCabecera(MensajeCabecera mensajeCabecera) {
		return mensajeCabeceraService.create(mensajeCabecera); //No está bien implementado esto por el momento
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public MensajeCabecera updateMensajeCabecera(@PathVariable("id") String id, MensajeCabecera mensajeCabecera) {
		return mensajeCabeceraService.update(Long.parseLong(id), mensajeCabecera);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteMensajeCabecera(@PathVariable("id") String id) {
		mensajeCabeceraService.delete(Long.parseLong(id));
	}
}
