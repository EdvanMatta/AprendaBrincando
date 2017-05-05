package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogo1;
    private ImageView botaoJogo2;
    private ImageView botaoJogo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogo1 = (ImageView) findViewById(R.id.botaoJogo1_Id);
        botaoJogo2 = (ImageView) findViewById(R.id.botaoJogo2_Id);
        botaoJogo3 = (ImageView) findViewById(R.id.botaoJogo3_Id);

        botaoJogo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JogoLeiaBicho.class));
                finish();
            }
        });

        botaoJogo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObjetoDiferente.class));
                finish();
            }
        });

        botaoJogo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EncontreObjeto.class));
                finish();
            }
        });
    }

//    public void AlertDialog(final Context contexto){
//        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Aprenda Brincando");
//        builder.setMessage("Digite o seu nome");
//        final EditText input = new EditText(this);
//        builder.setView(input);
//        builder.setNegativeButton("Enviar", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                String nome = input.getText().toString();
//                Bundle b = new Bundle();
//                b.putString("nome", nome);
//                Intent i = new Intent(contexto, Score.class);
//                i.putExtras(b);
//                startActivity(i);
//            }
//        });
//        AlertDialog alerta = builder.create();
//        alerta.show();
//    }
}
