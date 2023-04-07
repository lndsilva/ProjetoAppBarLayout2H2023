package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //Declarar a variavel global da toolbar
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declarar o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        //colocar a ação de clique o icone do menu
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no menu",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //Criando o clique nos itens de menu
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorito:

                        //Abrindo a janela do BottomBar
                        startActivity(new Intent(getApplicationContext(),
                                BottomNavActivity.class));

                        break;
                    case R.id.mCompartilhar:
                            startActivity(new Intent(getApplicationContext(),
                                    BottomNavigationActivity.class));
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNofiticacao:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no menu",
                                Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}