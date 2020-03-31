package br.com.fiap.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRelativeLayout(View view) {
        Intent it = new Intent(this, RelativeLayoutActivity.class);
        startActivity(it);
    }

    public void abrirAbsoluteLayout(View view) {
        Intent it = new Intent(this, AbsoluteActivity.class);
        startActivity(it);
    }

    public void abrirFrameLayout(View view) {
        Intent it = new Intent(this, FrameLayoutActivity.class);
        startActivity(it);
    }
}
