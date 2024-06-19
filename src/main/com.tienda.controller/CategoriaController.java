package com.tienda.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/Listado")
    public String listado(Model model) {

        List<Categoria> lista = categoriaService.getCategorias(false);
        model.addAllAttributes("Categorias",lista);
        model.addAllAttributes("totalCategorias",lista.size());
        return "view.name";
    }

    
}
