package br.com.fiap.jogodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer[] imagens = new Integer[]{
            R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6,
    };

    ImageView imgDado1;
    ImageView imgDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgDado1 = findViewById(R.id.imgDado1);
        imgDado2 = findViewById(R.id.imgDado2);
    }

    public void jogarDados(View view) {
        Random r = new Random();
        int sorteado1 = r.nextInt(imagens.length);
        int sorteado2 = r.nextInt(imagens.length);

        imgDado1.setImageResource(imagens[sorteado1]);
        imgDado2.setImageResource(imagens[sorteado2]);

        if (sorteado1 > sorteado2) {
            Toast.makeText(this, "Jogador 1 ganhou", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_SHORT).show();
        }
        if(sorteado1 == sorteado2){
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
        }
    }
}
