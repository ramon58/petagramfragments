package com.ramasolutions.petagramfragments.pojo;

import java.util.ArrayList;

public class PerfilMascota {
    private int fotoPerfil;
    private String nombre;
    private ArrayList<Mascota> detalleFotosPerfil;

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mascota> getDetalleFotosPerfil() {
        return detalleFotosPerfil;
    }

    public void setDetalleFotosPerfil(ArrayList<Mascota> detalleFotosPerfil) {
        this.detalleFotosPerfil = detalleFotosPerfil;
    }
}
