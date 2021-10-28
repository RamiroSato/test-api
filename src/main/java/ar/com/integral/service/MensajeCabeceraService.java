package ar.com.integral.service;

import java.util.List;

import ar.com.integral.domain.MensajeCabecera;
import ar.com.integral.exception.ResourceNotFoundException;

public interface MensajeCabeceraService {
        public MensajeCabecera get(Long id) throws ResourceNotFoundException;
        public List<MensajeCabecera> getAll();
        public MensajeCabecera create(MensajeCabecera mensajeCabecera);
        public MensajeCabecera update(Long id, MensajeCabecera mensajeCabecera) throws ResourceNotFoundException;
        public MensajeCabecera delete(Long id) throws ResourceNotFoundException;
}
