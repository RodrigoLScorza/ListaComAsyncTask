package com.example.logonrm.listacomasynctask.adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.logonrm.listacomasynctask.R;
import com.example.logonrm.listacomasynctask.listener.OnItemClickListener;
import com.example.logonrm.listacomasynctask.model.Android;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by logonrm on 29/01/2018.
 */

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.AndroidItemViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Android> androids;
    OnItemClickListener listener;

    public AndroidAdapter(Context context, List<Android> androids) {
        this.context = context;
        this.androids = androids;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public AndroidItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_android, parent, false);
        return new AndroidItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AndroidItemViewHolder holder, int position) {
        Android android = androids.get(position);

        holder.tvVersao.setText(android.getVersao());
        holder.tvApi.setText(android.getApi());
        holder.tvNome.setText(android.getNome());
        Picasso.with(context).load(android.getUrlImage()).into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return androids.size();
    }

    public  void setClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public Android getItem(int position){
        return androids.get(position);
    }

    protected class AndroidItemViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        private ImageView ivLogo;
        private TextView tvNome;
        private TextView tvApi;
        private TextView tvVersao;

        public AndroidItemViewHolder(View itemView) {
            super(itemView);

            ivLogo = itemView.findViewById(R.id.ivLogo);
            tvNome = itemView.findViewById(R.id.tvNome);
            tvApi = itemView.findViewById(R.id.tvApi);
            tvVersao = itemView.findViewById(R.id.tvVersao);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener != null) listener.onClick(v, getAdapterPosition());
        }
    }
}
