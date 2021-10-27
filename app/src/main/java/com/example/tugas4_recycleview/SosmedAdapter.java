package com.example.tugas4_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SosmedAdapter extends RecyclerView.Adapter<SosmedAdapter.SosmedViewHolder> {

    private ArrayList<Sosmed> dataList;

    public SosmedAdapter(ArrayList<Sosmed> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public SosmedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new SosmedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SosmedViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtIsi.setText(dataList.get(position).getIsi());
        holder.gambar.setImageResource(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class SosmedViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtIsi;
        private ImageView gambar;

        public SosmedViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtIsi = (TextView) itemView.findViewById(R.id.txt_isi);
            gambar = (ImageView) itemView.findViewById(R.id.image1);

        }
    }
}