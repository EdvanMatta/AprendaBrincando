package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class HistoricoScores extends AppCompatActivity {

    private ListView listaUsuario;
    Usuario usuario = new Usuario();
    private static final String ARQUIVO_PREFERENCIA = "Scores_Jogo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_scores);

        listaUsuario = (ListView) findViewById(R.id.listViewID);

        SharedPreferences shared = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
        if (shared.contains("nome")){
            usuario.setNomeJogo(shared.getString("jogo", "Jogo não encontrado"));
            usuario.setNome(shared.getString("nome", "nome não encontrado"));
            usuario.setPontoAcertos(shared.getInt("acertos",0));
            usuario.setPontoErros(shared.getInt("erros", 0));
        }

        ArrayAdapter<Usuario> adaptador = new ArrayAdapter<Usuario>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                (List<Usuario>) usuario);

        listaUsuario.setAdapter(adaptador);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
