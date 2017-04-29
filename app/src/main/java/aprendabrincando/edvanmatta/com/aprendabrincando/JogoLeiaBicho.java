package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class JogoLeiaBicho extends AppCompatActivity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView vaca;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private TextView texto;
    private MediaPlayer som;
    private String[] animal = {"Cão", "Gato", "Vaca", "Leão", "Ovelha", "Macaco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_leia_bicho);

        //recupera os artefatos do layout e atribui a variavel
        cao = (ImageView) findViewById(R.id.caoId);
        gato = (ImageView) findViewById(R.id.gatoId);
        vaca = (ImageView) findViewById(R.id.vacaId);
        leao = (ImageView) findViewById(R.id.leaoId);
        ovelha = (ImageView) findViewById(R.id.ovelhaId);
        macaco = (ImageView) findViewById(R.id.macacoId);
        texto = (TextView) findViewById(R.id.txtAnimalId);

        palavraAleatoria();
        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        vaca.setOnClickListener(this);
        leao.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        macaco.setOnClickListener(this);
    }

    public void tocarMusica() {
        if (som != null) {
            som.start();
        }
    }

    //Gerar palavra aleatóriamente
    public void palavraAleatoria() {
        Random radomico = new Random();
        int valor = radomico.nextInt(animal.length);
        final String palavra = animal[valor];
        texto.setText(palavra);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.caoId:
                if (texto.getText().equals("Cão")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.cao);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
            case R.id.gatoId:
                if (texto.getText().equals("Gato")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.gato);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
            case R.id.vacaId:
                if (texto.getText().equals("Vaca")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.vaca);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
            case R.id.leaoId:
                if (texto.getText().equals("Leão")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.leao);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
            case R.id.ovelhaId:
                if (texto.getText().equals("Ovelha")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.ovelha);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
            case R.id.macacoId:
                if (texto.getText().equals("Macaco")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.macaco);
                    tocarMusica();
                    palavraAleatoria();
                }
                break;
        }

    }

    @Override
    protected void onDestroy() {
        if (som != null) {
            som.stop();
            som.release();
            som = null;
        }
        super.onDestroy();
    }
}
