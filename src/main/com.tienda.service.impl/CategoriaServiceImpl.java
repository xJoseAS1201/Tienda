package com.tienda.service.impl;

import com.tienda.domain.CategoriaDao;
import com.tienda.domain.Categoria;
import tienda.*;
import com.tienda.service.CategoriaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activo){
        List<Categoria> lista = categoria.Dao.findAll();

        if (activo){
            lista.removeIf(c -> !c.isActivo());
        }

    }
    
}
