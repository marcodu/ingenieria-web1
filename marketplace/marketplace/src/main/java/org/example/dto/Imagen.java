package org.example.dto;

import java.time.LocalDateTime;

public class Imagen {
    private int idImagen;
    private String url;
    private String altText;
    private int entityId;
    private String entityType;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    private LocalDateTime deletedAt;

    public boolean estaEliminada() {
        return deletedAt != null;
    }

    public void eliminar() {
        this.deletedAt = LocalDateTime.now();
    }

    public boolean perteneceA(String tipoEntidad) {
        return this.entityType.equalsIgnoreCase(tipoEntidad);
    }
}