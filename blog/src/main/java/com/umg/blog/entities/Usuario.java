package com.umg.blog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    private Long id;

    private String nombreUsuario;
    private String correo;

    // Constructores
    public Usuario() {}

    public Usuario(Long id, String nombreUsuario, String correo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
