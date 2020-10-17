package com.ramasolutions.petagramfragments.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ramasolutions.petagramfragments.R;
import com.ramasolutions.petagramfragments.adapter.MascotaAdaptador;
import com.ramasolutions.petagramfragments.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> listadoMascotas;
    private RecyclerView recyclerView;
    public MascotaAdaptador adaptador;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_recycler_view, container,false);
        /* return super.onCreateView(inflater, container, savedInstanceState);*/
        recyclerView = v.findViewById(R.id.rvMascotas);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);
        obtenerListadoMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(listadoMascotas, getActivity());
        recyclerView.setAdapter(adaptador);
    }
    public void obtenerListadoMascotas() {
        listadoMascotas = new ArrayList<>();
        listadoMascotas.add(new Mascota("Nube", 7, R.drawable.perro_uno));
        listadoMascotas.add(new Mascota("Fido", 1, R.drawable.perro_dos));
        listadoMascotas.add(new Mascota("Patan", 6, R.drawable.perro_tres));
        listadoMascotas.add(new Mascota("Leo", 5, R.drawable.perro_cuatro));
        listadoMascotas.add(new Mascota("Tom", 2, R.drawable.perro_cinco));
        listadoMascotas.add(new Mascota("Sultan", 3, R.drawable.perro_seis));
        listadoMascotas.add(new Mascota("Superman", 4, R.drawable.perro_siete));
        listadoMascotas.add(new Mascota("Pulgoso", 8, R.drawable.perro_ocho));
    }
}
