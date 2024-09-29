package com.example.appcarrosrcv.adaptadores;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appcarrosrcv.R;
import com.example.appcarrosrcv.VistaCarro;
import com.example.appcarrosrcv.clases.carro;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CarroAdaptador extends RecyclerView.Adapter<CarroAdaptador.ViewHolder>{

    private List<carro> datos;
    private Context context;

    public CarroAdaptador(Context context, List <carro> datos) {

        this.datos = datos;
        this.context=context;

    }

    @NonNull
    @Override
    public CarroAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carro,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdaptador.ViewHolder holder, int position) {
        carro dato = datos.get(position);
        holder.bind(dato);
        holder.cardView.setOnClickListener(view -> {
            Intent i= new Intent(context, VistaCarro.class);
            i.putExtra("carro",dato);
            context.startActivity(i);

        });

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_carro,txt_modelo,txt_precio;
        ImageView img_carro;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_carro= itemView.findViewById(R.id.txt_nombre_carro);
            txt_modelo= itemView.findViewById(R.id.txt_modelo);
            txt_precio= itemView.findViewById(R.id.txt_precio);
            img_carro= itemView.findViewById(R.id.img_carro);
            cardView= itemView.findViewById(R.id.card_view);
        }

        public void bind(carro dato){
            txt_nombre_carro.setText(dato.getNombre());
            txt_modelo.setText(dato.getModelo());
            txt_precio.setText(dato.getPrecio());
            //imgaes
            Picasso.get().load(dato.getImagen()).into(img_carro);

        }
    }


}
