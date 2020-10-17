package com.ramasolutions.petagramfragments.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramasolutions.petagramfragments.R;
import com.ramasolutions.petagramfragments.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> listadoMascotas;
    Activity activity;

    public  MascotaAdaptador(ArrayList<Mascota> listadoMascotas, Activity activity){
        this.listadoMascotas=listadoMascotas;
        this.activity=activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota= listadoMascotas.get(position);
        mascotaViewHolder.imgFotoCV.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvTotalLikeCV.setText(""+mascota.getCantidadRaiting());
        mascotaViewHolder.btnLikeCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                mascota.setCantidadRaiting(mascota.getCantidadRaiting()+1);
                mascotaViewHolder.tvTotalLikeCV.setText(""+mascota.getCantidadRaiting());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listadoMascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoCV;
        private ImageButton btnLikeCV;
        private TextView tvNombreCV;
        private TextView tvTotalLikeCV;
        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFotoCV=(ImageView)itemView.findViewById(R.id.imgFotoCV);
            btnLikeCV=(ImageButton)itemView.findViewById(R.id.btnLikeCV);
            tvNombreCV=(TextView)itemView.findViewById(R.id.tvNombreCV);
            tvTotalLikeCV=(TextView)itemView.findViewById(R.id.tvTotalLikeCV);

        }
    }
}

