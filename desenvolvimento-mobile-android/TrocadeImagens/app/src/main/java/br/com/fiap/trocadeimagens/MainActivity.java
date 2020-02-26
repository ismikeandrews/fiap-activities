package br.com.fiap.trocadeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer[] imagens = new Integer[]{
            R.drawable.banana,
            R.drawable.kiwi,
            R.drawable.laranja,
            R.drawable.uva
    };

    ImageView imgFruta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFruta = findViewById(R.id.imgFruta);
    }

    public void trocarImagem(View view) {
        Random r = new Random();
        int sorteado = r.nextInt(imagens.length);

        imgFruta.setImageResource(imagens[sorteado]);
    }
}
