package com.example.documentacao.service;

import com.example.documentacao.entity.Categoria;
import com.example.documentacao.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> findAll() { return repository.findAll(); }
    public Categoria findById(Long id) { return repository.findById(id).orElse(null); }
    public Categoria save(Categoria categoria) { return repository.save(categoria); }
    public void delete(Long id) { repository.deleteById(id); }
}
