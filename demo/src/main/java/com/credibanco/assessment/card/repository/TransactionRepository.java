package com.credibanco.assessment.card.repository;

import com.credibanco.assessment.card.model.Tarjeta;
import com.credibanco.assessment.card.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Optional<Transaction> findByTarjetaPanAndReferencia(String pan, String referencia);
    List<Transaction> findByTarjeta(Tarjeta tarjeta);

}

