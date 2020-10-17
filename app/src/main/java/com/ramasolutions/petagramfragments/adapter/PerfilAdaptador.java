package com.ramasolutions.petagramfragments.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramasolutions.petagramfragments.R;
import com.ramasolutions.petagramfragments.pojo.Mascota;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder>{

    ArrayList<Mascota> listadoMascotas;
    Activity activity;

    public PerfilAdaptador(ArrayList<Mascota> listadoMascotas, Activity activity){
        this.listadoMascotas=listadoMascotas;
        this.activity=activity;
    }

    @NonNull
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil, parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final PerfilViewHolder mascotaViewHolder, int position) {
        final Mascota mascota= listadoMascotas.get(position);
        mascotaViewHolder.imgFotoPerfilCV.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvTotalLikePerfilCV.setText(""+mascota.getCantidadRaiting());

    }

    @Override
    public int getItemCount() {
        return listadoMascotas.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoPerfilCV;
        private TextView tvTotalLikePerfilCV;
        public PerfilViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotoPerfilCV=(ImageView)itemView.findViewById(R.id.imgFotoPerfilCV);
            tvTotalLikePerfilCV=(TextView)itemView.findViewById(R.id.tvTotalLikePerfilCV);

        }
    }
}

