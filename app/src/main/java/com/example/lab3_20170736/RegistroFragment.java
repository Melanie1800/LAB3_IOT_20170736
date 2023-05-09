package com.example.lab3_20170736;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.lab3_20170736.entity.Usuario;
import com.example.lab3_20170736.entity.UsuarioWebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RegistroFragment extends Fragment  {
    private EditText nombremascota, nombre, genero, dni, descripcion,ruta;
    private Button register;
    /**
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public RegistroFragment() {
        // Required empty public constructor
    }


     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment BlankFragment.

    // TODO: Rename and change types and number of parameters
    public static RegistroFragment newInstance(String param1, String param2) {
        RegistroFragment fragment = new RegistroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    } */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_registro,container,false);
        nombremascota=view.findViewById(R.id.nombreMascota);
        nombre=view.findViewById(R.id.nombrePersona);
        genero=view.findViewById(R.id.genero);
        dni=view.findViewById(R.id.dni);
        descripcion=view.findViewById(R.id.descripcion);
        ruta=view.findViewById(R.id.ruta);
        register=view.findViewById(R.id.buttonRegistro);

        //EL API
        UsuarioWebService usuariows=new Retrofit.Builder()
                .baseUrl("http://localhost:8084")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UsuarioWebService.class);
        Usuario usuario=new Usuario(nombre.getText().toString(), genero.getText().toString(), dni.getText().toString(), descripcion.getText().toString(), ruta.getText().toString(), nombremascota.getText().toString());

        usuariows.RegistroUser(usuario).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String body= response.body();;
                Log.d("msg-test", body);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                t.getStackTrace();

            }
        });

        return view;
    }




}