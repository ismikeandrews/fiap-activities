package br.com.fiap.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("meu log", "Passou pelo onCreate");
    }

    @Override

    protected void onStart(){
        super.onStart();

        Log.d("asdas", "Testeee on start");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d("asdas", "asd");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("asdas", "asd");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("asdas", "asd");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("asdas", "asd");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("asdas", "asd");
    }
}
