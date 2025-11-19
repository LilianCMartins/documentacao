package com.example.documentacao.controller;

import com.example.documentacao.entity.Categoria;
import com.example.documentacao.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Categoria> findAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Categoria findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return service.save(categoria);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria categoria) {
        categoria.setId(id);
        return service.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
