package ar.com.integral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.integral.exception.TestException;
import ar.com.integral.repository.MensajeCabeceraRepo;
import ar.com.integral.repository.MensajeDetalleRepo;
import ar.com.integral.domain.MensajeCabecera;
import ar.com.integral.domain.MensajeDetalle;

@RestController
public class TestController {
	@Autowired
	private MensajeCabeceraRepo mensajeCabeceraRepo;
	@Autowired
	private MensajeDetalleRepo mensajeDetalleRepo;
	
	@RequestMapping("/")
	public String hello(){
		System.out.println("Hi");
		return "Hello World!";
	}
	
	@RequestMapping("/det/findall")
	public String Test() throws TestException{
		String ret = "";
		List<MensajeDetalle> detalles = mensajeDetalleRepo.findAll();
		System.out.println("Detalles: ");
		for(MensajeDetalle detalle : detalles){
			ret += detalle.toString() +"\n";
			System.out.println(detalle.toString());
		};
		return ret;
	}
	
	@RequestMapping("/cab/findall")
	public String findAll() throws TestException{
		String ret = "Cabeceras: \n";
		List<MensajeCabecera> cabeceras = mensajeCabeceraRepo.findAll();
		System.out.println("Cabeceras: ");
		for(MensajeCabecera cabecera : cabeceras) {
			ret += cabecera.toString() +"\n";
			System.out.println(cabecera.toString());
		}
		return ret;
	}
	
	
	@GetMapping("/json/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String getJson(@PathVariable Integer id){
		
		
		return "" + id;
	}
	
	
}
