package ar.com.integral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.integral.domain.MensajeCabecera;

public interface MensajeCabeceraRepo extends JpaRepository<MensajeCabecera, Long> {

}
