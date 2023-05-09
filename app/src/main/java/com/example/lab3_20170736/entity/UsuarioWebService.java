package com.example.lab3_20170736.entity;

import com.example.lab3_20170736.entity.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsuarioWebService {
    @FormUrlEncoded
    @POST("/user?fetchid=true")
    Call<String> RegistroUser(@Field("usuario")Usuario usuario);

    @GET("/usuarios")
    Call<List<Usuario>> getUsuarios();




}
