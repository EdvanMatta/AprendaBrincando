package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    private TextView nome;
    private TextView nomeJogo;
    private TextView pontosAcertos;
    private TextView pontosErros;
    private Button   botaoVoltar;

    private int pontosA;
    private int pontosE;

    private static final String ARQUIVO_PREFERENCIA = "Scores_Jogo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        nome = (TextView) findViewById(R.id.txtNomeID);
        nomeJogo = (TextView) findViewById(R.id.txtNomeJogoID);
        pontosAcertos = (TextView) findViewById(R.id.txtPontoAID);
        pontosErros = (TextView) findViewById(R.id.txtPontoEID);
        botaoVoltar = (Button) findViewById(R.id.botaoVoltarID);

        Intent it = getIntent();
        String jogo = it.getStringExtra("jogo");
        String nomeExtra = it.getStringExtra("nome");
        String pontosA = Integer.toString(it.getIntExtra("pontosAcertos", 0));
        String pontosE = Integer.toString(it.getIntExtra("pontosErros", 0));

        nomeJogo.setText(jogo);
        nome.setText(nomeExtra);
        pontosAcertos.setText(pontosA);
        pontosErros.setText(pontosE);

        SharedPreferences shared = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        SharedPreferences.Editor editor = shared.edit();
        editor.putString("jogo", jogo);
        editor.putString("nome", nomeExtra);
        editor.putString("acertos", pontosA);
        editor.putString("erros", pontosE);
        editor.commit();

        String nJogo = shared.getString("jogo", "Jogo não encontrado");

        Log.i("Nome Jogo", "N: " + nJogo);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Score.this, MainActivity.class));
                finish();
            }
        });
    }
}
