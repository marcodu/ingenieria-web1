package org.example.dto;

import java.time.LocalDateTime;

public class Mensaje {
    private int idMensaje;
    private String contenido;
    private LocalDateTime fechaEnvio = LocalDateTime.now();
    private Usuario emisor;
    private Conversacion conversacion;

    public Mensaje(Usuario emisor, String contenido, Conversacion conversacion) {
        this.emisor = emisor;
        this.contenido = contenido;
        this.conversacion = conversacion;
    }

    public boolean esDe(Usuario usuario) {
        return this.emisor.equals(usuario);
    }

    public String obtenerResumen() {
        return contenido.length() <= 50 ? contenido : contenido.substring(0, 47) + "...";
    }
}