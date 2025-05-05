package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;
    private List<Anuncio> anuncios = new ArrayList<>();

    public void agregarAnuncio(Anuncio anuncio) {
        anuncios.add(anuncio);
    }

    public List<Anuncio> obtenerAnuncios() {
        return anuncios;
    }
}