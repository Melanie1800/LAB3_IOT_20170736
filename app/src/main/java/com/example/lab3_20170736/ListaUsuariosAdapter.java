package com.example.lab3_20170736;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab3_20170736.entity.Usuario;

import java.util.List;

public class ListaUsuariosAdapter extends RecyclerView.Adapter<ListaUsuariosAdapter.ListaUsuariosViewHolder>{
    private List<Usuario> listaUsuarios;
    private Context context;

    @NonNull
    @Override
    public ListaUsuariosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv,parent,false);
        return new ListaUsuariosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaUsuariosViewHolder holder, int position) {
    Usuario u=listaUsuarios.get(position);
    holder.usuario=u;
        TextView textViewMascota=holder.itemView.findViewById(R.id.mascotaViewRv);
        textViewMascota.setText(u.getNombremascota());
        TextView textViewGenero=holder.itemView.findViewById(R.id.generoViewRv2);
        textViewGenero.setText(u.getGenero());
        TextView textViewDueno=holder.itemView.findViewById(R.id.nombrePersona);
        textViewDueno.setText(u.getNombre());
        TextView textViewDescrip=holder.itemView.findViewById(R.id.descripViewRv4);
        textViewDescrip.setText(u.getDescripcion());
        TextView textViewRuta=holder.itemView.findViewById(R.id.rutaViewRv5);
        textViewRuta.setText(u.getRuta());
        TextView textViewDNI=holder.itemView.findViewById(R.id.DNIViewRv);
        textViewDNI.setText(u.getDni());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public void setContext(HistorialFragment historialFragment) {
    }

    public class ListaUsuariosViewHolder extends RecyclerView.ViewHolder{
        Usuario usuario;
        public ListaUsuariosViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public List<Usuario> getListaEmpleados() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
