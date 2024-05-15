package com.prova.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.entity.ListaCompartilhada;
import com.prova.services.ListaCompartilhadaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/listacompartilhada")
public class ListaCompartilhadaController {
    private final ListaCompartilhadaService listaCompartilhadaService;

    public ListaCompartilhadaController(ListaCompartilhadaService listaCompartilhadaService) {
        this.listaCompartilhadaService = listaCompartilhadaService;
    }

    @GetMapping("/lista-compartilhada")
    public ResponseEntity<List<ListaCompartilhada>> getAllListaCompartilhada() {
        List<ListaCompartilhada> listacompartilhada = listaCompartilhadaService.getAllListaCompartilhada();
        if (listacompartilhada.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(listacompartilhada);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ListaCompartilhada> getListaCompartilhadaById(@PathVariable("id") int id) {
        ListaCompartilhada lista = listaCompartilhadaService.getListaCompartilhadaById(id);
        if (lista == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/{id}/status/{novoStatus}")
    public ResponseEntity<String> atualizarStatusListaCompartilhada(@PathVariable int id, @PathVariable int novoStatus) {
        try {
            listaCompartilhadaService.atualizarStatus(id, novoStatus);
            return ResponseEntity.ok("Status da lista compartilhada com ID " + id + " atualizado para " + novoStatus);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao atualizar o status da lista compartilhada com ID " + id);
        }
    }
}
