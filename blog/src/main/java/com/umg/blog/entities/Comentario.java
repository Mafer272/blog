package com.umg.blog.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comentario {

    @Id
    private Long id;

    private String texto;
    private LocalDate fechaComentario;

    // Constructores
    public Comentario() {}

    public Comentario(Long id, String texto, LocalDate fechaComentario) {
        this.id = id;
        this.texto = texto;
        this.fechaComentario = fechaComentario;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
}
