package br.com.fiap.activities_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNickname;
    EditText edtIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNickname = findViewById(R.id.edtNickname);
        edtIdade    = findViewById(R.id.edtIdade);
    }

    public void entrar(View view) {
        String nickname = edtNickname.getText().toString();
        String idade    = edtIdade.getText().toString();

        if (nickname.trim().isEmpty() || idade.trim().isEmpty()){
            Toast.makeText(this, "Informe corretamente os dados", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent it = new Intent(this, ExibirDadosActivity.class);

        //passagem de dados para outra activity
        it.putExtra("nickname", nickname);
        it.putExtra("idade", idade);

        startActivity(it);
    }
}
