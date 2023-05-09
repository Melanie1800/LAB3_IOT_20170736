package com.example.lab3_20170736;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lab3_20170736.databinding.ActivityMainBinding;
import com.example.lab3_20170736.entity.RetrofitBuilder;
import com.example.lab3_20170736.entity.Usuario;
import com.example.lab3_20170736.entity.UsuarioDto;
import com.example.lab3_20170736.entity.UsuarioWebService;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListaUsuariosAdapter adapter;
    ActivityMainBinding binding;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.registroBtn);
        button.setOnClickListener(view-> {
            button.setVisibility((View.GONE));
            Button button1=findViewById(R.id.emergenciaBtn);
            button1.setVisibility((View.GONE));
            Button button2=findViewById(R.id.historialBtn);
            button2.setVisibility((View.GONE));
            //hacia fragmment
            Fragment fragment=new RegistroFragment();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment).commit();
        });
        Button button1=findViewById(R.id.emergenciaBtn);
        button1.setOnClickListener(view-> {
            button1.setVisibility((View.GONE));
            Button button2=findViewById(R.id.historialBtn);
            button2.setVisibility((View.GONE));
            Button button3=findViewById(R.id.registroBtn);
            button3.setVisibility((View.GONE));
            //hacia fragmment
            EmergenciaFragment fragment=new EmergenciaFragment();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment).commit();
        });
        Button button2=findViewById(R.id.historialBtn);
        button2.setOnClickListener(view-> {
            button2.setVisibility((View.GONE));
            Button button3=findViewById(R.id.registroBtn);
            button3.setVisibility((View.GONE));
            Button button5=findViewById(R.id.emergenciaBtn);
            button5.setVisibility((View.GONE));

            //hacia fragmment
            Fragment fragment1= new HistorialFragment();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

        });

    }

    /*
    public void cargarLista() {

        UsuarioWebService usuarioWebService = RetrofitBuilder.createRepo("http://localhost:8084");

        usuarioWebService.getUsuarios().enqueue(new Callback<UsuarioDto>() {
            @Override
            public void onResponse(Call<UsuarioDto>call, Response<UsuarioDto>response) {
                if(response.isSuccessful()){
                    UsuarioDto usuarioDto = response.body();
                    for(Usuario usuario:usuarioDto.getLista()){
                        Log.d("msg-test", "first_name: " + usuario.getNombremascota());
                    }

                }

            }



            @Override
            public void onFailure(Call<UsuarioDto> call, Throwable t) {

            }

        });

    }

     */

}