package com.example.documentacao.service;

import com.example.documentacao.entity.Documento;
import com.example.documentacao.repository.DocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoService {

    private final DocumentoRepository repository;

    public DocumentoService(DocumentoRepository repository) {
        this.repository = repository;
    }

    public List<Documento> findAll() { return repository.findAll(); }
    public Documento findById(Long id) { return repository.findById(id).orElse(null); }
    public Documento save(Documento documento) { return repository.save(documento); }
    public void delete(Long id) { repository.deleteById(id); }
}
