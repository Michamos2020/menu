package com.example.menu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText txt_num1, txt_num2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num1 = (EditText) findViewById(R.id.txt_num1);
        txt_num2 = (EditText) findViewById(R.id.txt_num2);
        resultado = (TextView) findViewById(R.id.resultado);
        spinner = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);
    }
    //mètodo del boton
    public void Calcular(View view) {
        String num_1_String = txt_num1.getText().toString();
        String num_2_String = txt_num2.getText().toString();
        Toast toast = Toast.makeText(this, "Ya anota algo", Toast.LENGTH_SHORT);
        toast.show();
        int num_1_int = Integer.parseInt(num_1_String);
        int num_2_int = Integer.parseInt(num_2_String);
        String seleccion = spinner.getSelectedItem().toString();
        if (seleccion.equals("Sumar")) {
            int resultado_resta = num_1_int - num_2_int;
            String resultado_mostrar = String.valueOf(resultado_resta);
            resultado.setText(resultado_mostrar);
        } else if (seleccion.equals("Restar")) {
            int resultado_restar = num_1_int - num_2_int;
            String resultado_mostrar = String.valueOf(resultado_restar);
            resultado.setText(resultado_mostrar);
        }else if (seleccion.equals("Multiplicar")) {
            int resultado_multi = num_1_int * num_2_int;
            String resultado_mostrar = String.valueOf(resultado_multi);
            resultado.setText(resultado_mostrar);
        }try {

            if (seleccion.equals("Dividir")) {
                int resultado_dividir = num_1_int / num_2_int;
                String resultado_mostrar = String.valueOf(resultado_dividir);
                resultado.setText(resultado_mostrar);
            }else if (num_2_int!= 0){
                int resultado_dividir = num_1_int / num_2_int;
                String resultado_mostrar = String.valueOf(resultado_dividir);
                resultado.setText(resultado_mostrar);



                } else
                    resultado.setText("no digas meriyein");

        }catch(Exception e){
                Toast.makeText(getApplicationContext(), "recuerde que no puede dividir nada con nada, es como no tener amigos!!", Toast.LENGTH_SHORT).show();
            }



        }


    }






