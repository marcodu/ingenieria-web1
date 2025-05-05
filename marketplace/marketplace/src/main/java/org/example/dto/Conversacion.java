package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class Conversacion {
    private int idConversacion;
    private Anuncio anuncio;
    private Usuario interesado;
    private List<Mensaje> mensajes = new ArrayList<>();

    public Conversacion(Anuncio anuncio, Usuario interesado) {
        this.anuncio = anuncio;
        this.interesado = interesado;
    }

    public void agregarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    public List<Mensaje> obtenerMensajes() {
        return mensajes;
    }

    public Usuario obtenerInteresado() {
        return interesado;
    }

    public boolean esSobreAnuncio(Anuncio anuncio) {
        return this.anuncio.equals(anuncio);
    }
}