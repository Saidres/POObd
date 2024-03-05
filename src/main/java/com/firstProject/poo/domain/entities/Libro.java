package com.firstProject.poo.domain.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Libros")

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;
    private String titulo;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;
    private Double precio;
    @ManyToOne()
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer añoPublicacion) {
        this.anioPublicacion = añoPublicacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
