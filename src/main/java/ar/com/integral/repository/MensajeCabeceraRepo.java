package ar.com.integral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.integral.domain.MensajeCabecera;

@Repository
public interface MensajeCabeceraRepo extends JpaRepository<MensajeCabecera, Long> {

}
