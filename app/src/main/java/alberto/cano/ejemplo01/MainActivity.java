package alberto.cano.ejemplo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables de la interfaz
    private TextView textContador;
    private Button btnPulsa;

    private Button btnRestar;

    private Button btnReset;

    //Variables para la lógica de la aplicación
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Todo el código va despues de esta linea
            //inicializo variables de lógica

        contador = 0;
        inicializarComponentes();
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = 0;

                textContador.setTextColor(getColor(R.color.green));
                textContador.setText("---RESET---");

            }
        });
    }

    private void inicializarComponentes() {
        //inicializo las variables de interfaz
        textContador = findViewById(R.id.textView);
        btnPulsa = findViewById(R.id.btnPulsa);
        btnReset = findViewById(R.id.btnReset);
    }
    public  void btnPulsador(View vista){
        contador++;
        textContador.setTextColor(getColor(R.color.black));
        textContador.setText(contador+ " veces");

    }

    public  void btnResta(View vista){

        if (contador > 0) {
            contador --;
            textContador.setText(contador + " veces");
        } else {
            textContador.setTextSize(34);
            textContador.setText("No puede ser negativo");
            textContador.setTextColor(getColor(R.color.red));
        }
    }
    /*
    public  void btnReset(View vista){
        contador = 0;

        textContador.setTextColor(getColor(R.color.green));
        textContador.setText("---RESET---");

    }

     */


}       