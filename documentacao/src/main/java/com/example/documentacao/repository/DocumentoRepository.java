package com.example.documentacao.repository;

import com.example.documentacao.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {}
