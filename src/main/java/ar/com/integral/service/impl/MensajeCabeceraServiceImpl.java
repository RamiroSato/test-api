package ar.com.integral.service.Impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.integral.domain.MensajeCabecera;
import ar.com.integral.repository.MensajeCabeceraRepo;
import ar.com.integral.service.MensajeCabeceraService;

@Service
@Transactional
public class MensajeCabeceraServiceImpl implements MensajeCabeceraService {
    
    @Autowired
    private MensajeCabeceraRepo mensajeCabeceraRepo;

    @Override
    public MensajeCabecera get(Long id) {
        return mensajeCabeceraRepo.findById(id).get();
    }

    @Override
    public List<MensajeCabecera> getAll() {
        return mensajeCabeceraRepo.findAll();
    }

    @Override
    public MensajeCabecera create(MensajeCabecera mensajeCabecera) {
        return mensajeCabeceraRepo.save(mensajeCabecera);
    }

    @Override
    public MensajeCabecera update(Long id, MensajeCabecera mensajeCabecera) {
        MensajeCabecera mensajeCabeceraActual = mensajeCabeceraRepo.findById(id).get();
        return mensajeCabeceraActual;
    }
    
    @Override
    public MensajeCabecera delete(Long id) {
        MensajeCabecera mensajeCabecera = mensajeCabeceraRepo.findById(id).get();
        mensajeCabeceraRepo.delete(mensajeCabecera);
        return mensajeCabecera;
    }

    
}
