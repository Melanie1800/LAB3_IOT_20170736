package com.example.lab3_20170736;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lab3_20170736.databinding.ActivityMainBinding;
import com.example.lab3_20170736.entity.RetrofitBuilder;
import com.example.lab3_20170736.entity.Usuario;
import com.example.lab3_20170736.entity.UsuarioDto;
import com.example.lab3_20170736.entity.UsuarioWebService;

import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistorialFragment extends Fragment {
    ListaUsuariosAdapter adapter;
    ActivityMainBinding binding;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_historial, container, false);

    }

}