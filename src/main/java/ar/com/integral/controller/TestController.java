package ar.com.integral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.integral.exception.TestException;
import ar.com.integral.domain.MensajeDetalle;

@RestController
public class TestController {
	@Autowired
	private JdbcTemplate jt;
	@RequestMapping("/")
	public String hello(){
		System.out.println("Hi");
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public String Test() throws TestException{
		String sql = "SELECT TOP (10) * FROM t_sgp_mensajes_det";
		String ret = "";
		List<MensajeDetalle> detalles = jt.query(sql, BeanPropertyRowMapper.newInstance(MensajeDetalle.class));
		System.out.println("Hi");
		for(MensajeDetalle detalle : detalles){
			ret += detalle.toString() +"\n";
			System.out.println(detalle.toString());
		};
		return ret;
	}
	
	
	@GetMapping("/json/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String getJson(@PathVariable Integer id){
		
		
		return "" + id;
	}
	
	
}
