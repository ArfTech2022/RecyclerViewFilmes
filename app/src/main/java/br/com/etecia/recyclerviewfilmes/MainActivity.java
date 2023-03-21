package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    //Declarar o recycler view

    RecyclerView idRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("A Queda",
                        "Para as melhores amigas Becky e Hunter, a vida é sobre vencer medos e ultrapassar limites.",
                        "Aventura",
                        R.drawable.aqueda));
        listaFilmes.add(
                new Filmes("Efeito Dominó",
                        "Em setembro de 1971 foi construído um túnel para dentro da caixa-forte de um banco na Baker Street, em Londres.",
                        "Aventura",
                        R.drawable.efeitodomino));
        listaFilmes.add(
                new Filmes("O Buraco",
                        "Quatro adolescentes em uma escola particular na Inglaterra descobrem um abrigo subterrâneo usado na guerra e decidem se esconder nele para evitar uma excursão do colégio. ",
                        "Aventura",
                        R.drawable.oburaco));
        listaFilmes.add(
                new Filmes("Sem Limites",
                        "Encarando o desemprego e a rejeição de sua namorada, o escritor Eddie Morra tem certeza que não tem mais futuro.",
                        "Aventura",
                        R.drawable.semlimites));
        listaFilmes.add(
                new Filmes("Imperador",
                        "O general Douglas MacArthur designa um perito em inteligência militar e cultura japonesa de encontrar a resposta.",
                        "Aventura",
                        R.drawable.imperador));
        listaFilmes.add(
                new Filmes("Caos",
                        "Um detetive veterano se junta a um policial novato quando são enviados para negociar com um bando de criminosos que seguram reféns em um banco.",
                        "Aventura",
                        R.drawable.caos));

        //criando (instanciando) a classe adptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout que a lista irá seguir

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //Fixador de tamanho da lista - deixar a lista mais rápida

        idRecyclerView.setHasFixedSize(true);

        //Ligar o recyclerview ao adaptador

        idRecyclerView.setAdapter(adapter);
    }
}