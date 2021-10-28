package ar.com.integral.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.integral.domain.MensajeCabecera;
import ar.com.integral.exception.ResourceNotFoundException;
import ar.com.integral.repository.MensajeCabeceraRepo;
import ar.com.integral.service.MensajeCabeceraService;

@Service
@Transactional
public class MensajeCabeceraServiceImpl implements MensajeCabeceraService {
    
    @Autowired
    private MensajeCabeceraRepo mensajeCabeceraRepo;

    @Override
    public MensajeCabecera get(Long id) throws ResourceNotFoundException {
        return mensajeCabeceraRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("MensajeCabecera not found with id " + id));
    }

    @Override
    public List<MensajeCabecera> getAll() {
        return mensajeCabeceraRepo.findAll();
    }

    @Override
    public MensajeCabecera create(MensajeCabecera mensajeCabecera){ 
        return mensajeCabeceraRepo.save(mensajeCabecera);
    }

    @Override
    public MensajeCabecera update(Long id, MensajeCabecera mensajeCabecera) throws ResourceNotFoundException { 
        MensajeCabecera mensajeCabeceraActual = mensajeCabeceraRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("MensajeCabecera could not be updated. No matching resource with id " + id));
        mensajeCabeceraActual.update(mensajeCabecera);
        return mensajeCabeceraActual;
    }
    
    @Override
    public MensajeCabecera delete(Long id) throws ResourceNotFoundException {
        MensajeCabecera mensajeCabecera = mensajeCabeceraRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("MensajeCabecera could not be deleted. No matching resource with id " + id));
        mensajeCabeceraRepo.delete(mensajeCabecera);
        return mensajeCabecera;
    }

    
}
