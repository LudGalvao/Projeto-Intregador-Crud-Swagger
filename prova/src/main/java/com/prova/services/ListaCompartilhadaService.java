package com.prova.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prova.entity.ListaCompartilhada;
import com.prova.repository.ListaCompartilhadaRepository;

import jakarta.transaction.Transactional;

@Service
public class ListaCompartilhadaService {
    private final ListaCompartilhadaRepository listaCompartilhadaRepository;

    public ListaCompartilhadaService(ListaCompartilhadaRepository listaCompartilhadaRepository) {
        this.listaCompartilhadaRepository = listaCompartilhadaRepository;
    }

    @Transactional
    public List<ListaCompartilhada> getAllListaCompartilhada() {
        return listaCompartilhadaRepository.findAll();
    }

    @Transactional
    public void atualizarStatus(int id, int novoStatus) {
        Optional<ListaCompartilhada> listaCompartilhadaOptional = listaCompartilhadaRepository.findById(id);
        listaCompartilhadaOptional.ifPresent(listaCompartilhada -> {
            listaCompartilhada.setStatus(novoStatus);
            listaCompartilhadaRepository.save(listaCompartilhada);
        });
    }
    
 	public ListaCompartilhada getListaCompartilhadaById(int id) {
 		Optional<ListaCompartilhada> listaCompartilhada = listaCompartilhadaRepository.findById(id);  
 		return listaCompartilhada.orElse(null);
 	}
    
    
}
