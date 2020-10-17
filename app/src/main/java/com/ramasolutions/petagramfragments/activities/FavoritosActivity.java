package com.ramasolutions.petagramfragments.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ramasolutions.petagramfragments.R;
import com.ramasolutions.petagramfragments.adapter.MascotaAdaptador;
import com.ramasolutions.petagramfragments.pojo.Mascota;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public MascotaAdaptador adaptador;
    ArrayList<Mascota> mascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView= findViewById(R.id.rvMascotas);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);

        obtenerMascotasFavoritas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        adaptador= new MascotaAdaptador(mascotasFavoritas, this);
        recyclerView.setAdapter(adaptador);
    }
    public void obtenerMascotasFavoritas(){
        mascotasFavoritas=new ArrayList<>();
        mascotasFavoritas.add(new Mascota("Leo",7,R.drawable.perro_cuatro));
        mascotasFavoritas.add(new Mascota("Nube",6,R.drawable.perro_uno));
        mascotasFavoritas.add(new Mascota("Tom",5,R.drawable.perro_cinco));
        mascotasFavoritas.add(new Mascota("Patan",5,R.drawable.perro_tres));
        mascotasFavoritas.add(new Mascota("Fido",4,R.drawable.perro_dos));

    }
}

