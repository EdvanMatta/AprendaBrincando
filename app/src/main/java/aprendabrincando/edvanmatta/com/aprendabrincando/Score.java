package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    private TextView nome;
    private TextView pontosAcertos;
    private TextView pontosErros;
    private Button botaoVoltar;

    private int pontosA;
    private int pontosE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        nome = (TextView) findViewById(R.id.txtNomeID);
        pontosAcertos = (TextView) findViewById(R.id.txtPontoAID);
        pontosErros = (TextView) findViewById(R.id.txtPontoEID);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarID);
        Intent it = getIntent();
//        Bundle it = getIntent().getExtras();
        String nomeExtra = it.getStringExtra("nome");
        String pontosA = Integer.toString(it.getIntExtra("pontosAcertos",0));
        String pontosE = Integer.toString(it.getIntExtra("pontosErros", 0));

        nome.setText(nomeExtra);
        pontosAcertos.setText(pontosA);
        pontosErros.setText(pontosE);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Score.this, MainActivity.class));
                finish();
            }
        });
    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
}
