package com.tienda.controller;

import jakarta.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import lombok.Data;

@Data 
@Entity
@Table (name="categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTIFY)
    @Column (name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria(){
    }

    @OneToMany
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    List<Producto> productos;


    public Categoria (String descripcion, String rutaImagen, boolean activo){

    this.descripcion = descripcion;
    this.rutaImagen = rutaImagen;
    this.activo = activo;
}

}
