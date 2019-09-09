package io.fabio.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.fabio.delivery.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
 
	 
}
