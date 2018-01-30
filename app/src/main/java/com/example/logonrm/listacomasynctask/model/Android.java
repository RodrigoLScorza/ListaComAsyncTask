package com.example.logonrm.listacomasynctask.model;

/**
 * Created by logonrm on 29/01/2018.
 */

public class Android {

    public  static  final String TAG_ANDROID = "android";
    public  static  final String TAG_API = "api";
    public  static  final String TAG_URL_IMAGEM = "urlImagem";
    public  static  final String TAG_NOME = "nome";
    public  static  final String TAG_VERSAO = "versao";


    private String nome;
    private String api;
    private String urlImage;
    private String versao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
