package br.com.fiap.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNumero1;
    EditText edtNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
    }

    public void somar(View view){
        try {
            String strNum1 = edtNumero1.getText().toString();
            String strNum2 = edtNumero2.getText().toString();

            Double num1 = Double.parseDouble((strNum1));
            Double num2 = Double.parseDouble((strNum2));

            Double soma = num1 + num2;

            Toast.makeText(this, "A soma é = " + soma, Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,  "Verifique os dados informados", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    public void subitrair(View view){
        try {
            String strNum1 = edtNumero1.getText().toString();
            String strNum2 = edtNumero2.getText().toString();

            Double num1 = Double.parseDouble((strNum1));
            Double num2 = Double.parseDouble((strNum2));

            Double subtracao = num1 - num2;

            Toast.makeText(this, "A subtração é = " + subtracao, Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,  "Verifique os dados informados", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    public void multiplicar(View view){
        try {
            String strNum1 = edtNumero1.getText().toString();
            String strNum2 = edtNumero2.getText().toString();

            Double num1 = Double.parseDouble((strNum1));
            Double num2 = Double.parseDouble((strNum2));

            Double mult = num1 * num2;

            Toast.makeText(this, "A multiplicação é = " + mult, Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,  "Verifique os dados informados", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    public void divisao(View view){
        try {
            String strNum1 = edtNumero1.getText().toString();
            String strNum2 = edtNumero2.getText().toString();

            Double num1 = Double.parseDouble((strNum1));
            Double num2 = Double.parseDouble((strNum2));

            Double div = num1 / num2;

            Toast.makeText(this, "A divisao é = " + div, Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,  "Verifique os dados informados", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
