package ar.com.integral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.integral.domain.MensajeDetalle;

public interface MensajeDetalleRepo extends JpaRepository<MensajeDetalle,Long> {
    
}
