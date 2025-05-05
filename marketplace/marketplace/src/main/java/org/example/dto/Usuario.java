package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nombreCompleto;
    private String correo;
    private String contraseña;
    private List<Anuncio> anunciosPublicados = new ArrayList<>();
    private List<Anuncio> anunciosGuardados = new ArrayList<>();

    public void publicarAnuncio(Anuncio anuncio) {
        anunciosPublicados.add(anuncio);
    }

    public void guardarAnuncio(Anuncio anuncio) {
        anunciosGuardados.add(anuncio);
    }

    public Conversacion iniciarConversacion(Anuncio anuncio) {
        return new Conversacion(anuncio, this);
    }

    public void enviarMensaje(Conversacion conversacion, String contenido) {
        Mensaje mensaje = new Mensaje(this, contenido, conversacion);
        conversacion.agregarMensaje(mensaje);
    }

    public List<Anuncio> obtenerAnunciosPublicados() {
        return anunciosPublicados;
    }

    public List<Anuncio> obtenerAnunciosGuardados() {
        return anunciosGuardados;
    }
}