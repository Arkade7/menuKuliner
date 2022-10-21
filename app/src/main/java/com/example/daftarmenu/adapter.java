package com.example.daftarmenu;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{

    public adapter(ArrayList<makanan> listmakanan) {
        this.listmakanan = listmakanan;
    }

    private ArrayList<makanan> listmakanan;

    @NonNull
    @Override
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item2,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.ViewHolder holder, int position) {
        makanan makanan = listmakanan.get(position);
        holder.NamaMakanan.setText(makanan.getNama());
        holder.harga.setText(makanan.getHarga());
        holder.deskripsi.setText(makanan.getDesc());
        holder.gambar.setImageResource(makanan.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(),makanan.getDesc(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView deskripsi,NamaMakanan,harga;
        public ImageView gambar;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            NamaMakanan = (TextView) itemView.findViewById(R.id.NamaMakanan);
            harga = (TextView) itemView.findViewById(R.id.HargaMakanan);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            this.itemView = itemView.findViewById(R.id.mainLayout);
        }
    }
}