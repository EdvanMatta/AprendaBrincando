package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HistoricoScores extends AppCompatActivity {

    private ListView listaUsuario;
    List<Usuario> user;
    private static final String ARQUIVO_PREFERENCIA = "Scores_Jogo";

    String nomeJogo;
    String nomeJogador;
    int numAcertos;
    int numErros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico_scores);

        listaUsuario = (ListView) findViewById(R.id.listViewID);

        SharedPreferences shared = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
        //if (shared.contains("nome")){
            nomeJogo = shared.getString("jogo", "Jogo não encontrado");
            nomeJogador = shared.getString("nome", "nome não encontrado");
            numAcertos = shared.getInt("acertos",0);
            numErros = shared.getInt("erros", 0);
        //}
        //Log.i("Nome Jogo", "J: " + nomeJogo);
        user = gerarUsuario();

        ArrayAdapter<Usuario> adaptador = new ArrayAdapter<Usuario>( getApplicationContext(), 0, 0, user);
        listaUsuario.setAdapter(adaptador);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    private List<Usuario> gerarUsuario(){
        List<Usuario> usuario = new ArrayList<Usuario>();
        usuario.add(criarUsuario(nomeJogo, nomeJogador, numAcertos, numErros));
        return usuario;
    }

    private Usuario criarUsuario(String nomeJogo, String nomeJogador, int numAcertos, int numErros){
        Usuario usuario = new Usuario(nomeJogo, nomeJogador, numAcertos, numErros);
        return usuario;
    }
}
