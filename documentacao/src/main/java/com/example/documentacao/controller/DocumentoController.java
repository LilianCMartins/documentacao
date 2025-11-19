package com.example.documentacao.controller;

import com.example.documentacao.entity.Documento;
import com.example.documentacao.service.DocumentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    private final DocumentoService service;

    public DocumentoController(DocumentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Documento> findAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Documento findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Documento create(@RequestBody Documento doc) {
        return service.save(doc);
    }

    @PutMapping("/{id}")
    public Documento update(@PathVariable Long id, @RequestBody Documento doc) {
        doc.setId(id);
        return service.save(doc);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
