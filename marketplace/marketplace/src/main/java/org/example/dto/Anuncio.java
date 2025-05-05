package org.example.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Anuncio {
    private int idAnuncio;
    private String titulo;
    private String descripcion;
    private BigDecimal precio;
    private String estado = "Activo";
    private Usuario usuario;
    private Categoria categoria;
    private List<Imagen> imagenes = new ArrayList<>();

    public void agregarImagen(Imagen imagen) {
        imagenes.add(imagen);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public boolean estaActivo() {
        return "Activo".equalsIgnoreCase(estado);
    }

    public List<Imagen> obtenerImagenes() {
        return imagenes;
    }
}