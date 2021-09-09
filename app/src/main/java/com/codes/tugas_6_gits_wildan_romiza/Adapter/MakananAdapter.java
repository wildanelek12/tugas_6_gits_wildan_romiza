package com.codes.tugas_6_gits_wildan_romiza.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codes.tugas_6_gits_wildan_romiza.Model.Makanan;
import com.codes.tugas_6_gits_wildan_romiza.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {
    private Context context;
    private List<Makanan> makananList = new ArrayList<>();

    public MakananAdapter(Context context, List<Makanan> makananList) {
        this.context = context;
        this.makananList = makananList;
    }


    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_makanan, parent, false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.MakananViewHolder holder, int position) {
        Makanan makanan = makananList.get(position);
        holder.nama.setText(makanan.getNama());
        holder.harga.setText(makanan.getHarga());
        Glide.with(context)
                .load(makanan.getGambar())
                .centerCrop()
                .into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView gambar;
        TextView nama,harga;
        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            harga = itemView.findViewById(R.id.harga);
            gambar = itemView.findViewById(R.id.gambar);

        }
    }
}
