package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("A Queda",
                        "Para as melhores amigas Becky e Hunter, a vida é sobre vencer medos e ultrapassar limites.",
                        "Aventura",
                        R.drawable.A_queda));

        //criando (instanciando) a classe adptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);
    }
}