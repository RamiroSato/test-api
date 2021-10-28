package ar.com.integral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.integral.domain.MensajeDetalle;

@Repository
public interface MensajeDetalleRepo extends JpaRepository<MensajeDetalle,Long> {
    
}
