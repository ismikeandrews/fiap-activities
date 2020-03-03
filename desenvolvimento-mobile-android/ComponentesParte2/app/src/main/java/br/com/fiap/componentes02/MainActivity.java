package br.com.fiap.componentes02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgSabores;
    CheckBox checkBox;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgSabores = findViewById(R.id.rdgSabores);
        checkBox = findViewById(R.id.chkBordaReacheada);
    }

    public void realizarPedido(View view) {

        int selecionado;
        selecionado = rdgSabores.getCheckedRadioButtonId();
        RadioGroup rdbSelecionado = findViewById(selecionado);

        String bordaRecheada = checkBox.isChecked() ? "sim" : "não";

        String msg = String.format("O sabor foi selecionado foi %s e borda: %s", rdgSabores, bordaRecheada);

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

}
