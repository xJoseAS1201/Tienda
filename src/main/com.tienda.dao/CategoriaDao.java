package com.tienda.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
