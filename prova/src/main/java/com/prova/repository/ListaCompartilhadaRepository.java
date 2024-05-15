package com.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prova.entity.ListaCompartilhada;



@Repository
public interface ListaCompartilhadaRepository extends JpaRepository<ListaCompartilhada, Integer> {
}
