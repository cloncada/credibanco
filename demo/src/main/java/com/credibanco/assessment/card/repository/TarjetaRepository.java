package com.credibanco.assessment.card.repository;

import com.credibanco.assessment.card.model.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

    Optional<Tarjeta> findByPan(String pan);
    Optional<Tarjeta> findTarjetaById(Long id);

}
