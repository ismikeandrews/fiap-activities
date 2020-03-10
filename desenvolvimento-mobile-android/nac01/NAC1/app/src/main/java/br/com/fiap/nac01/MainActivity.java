package br.com.fiap.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer[] imagens = new Integer[] {
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    };

    ImageView imagensId;
    int soma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagensId = findViewById(R.id.img);
    }

    public void voltar(View view) {
        if (soma == 0) {
            soma = 6;
        } else {
            soma--;
        }

        imagensId.setImageResource(imagens[soma]);
    }

    public void avancar(View view) {
        if (soma == 6) {
            soma = 0;
        } else {
            soma++;
        }

        imagensId.setImageResource(imagens[soma]);
    }
}
