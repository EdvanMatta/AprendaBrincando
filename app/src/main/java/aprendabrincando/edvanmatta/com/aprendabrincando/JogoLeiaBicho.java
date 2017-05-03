package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    private int pontosAcertos;
    private int pontosErros;
    private int contador;
    int[] pontos;

    private int ACERTOS = 1;
    private int ERROS = 1;

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

    @Override
    protected void onResume() {
        super.onResume();
        contador = 0;
        pontosAcertos = 0;
        pontosErros = 0;
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
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);;
                break;
            case R.id.gatoId:
                if (texto.getText().equals("Gato")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.gato);
                    tocarMusica();
                    palavraAleatoria();
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);
                break;
            case R.id.vacaId:
                if (texto.getText().equals("Vaca")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.vaca);
                    tocarMusica();
                    palavraAleatoria();
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);
                break;
            case R.id.leaoId:
                if (texto.getText().equals("Leão")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.leao);
                    tocarMusica();
                    palavraAleatoria();
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);
                break;
            case R.id.ovelhaId:
                if (texto.getText().equals("Ovelha")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.ovelha);
                    tocarMusica();
                    palavraAleatoria();
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);
                break;
            case R.id.macacoId:
                if (texto.getText().equals("Macaco")) {
                    som = MediaPlayer.create(JogoLeiaBicho.this, R.raw.macaco);
                    tocarMusica();
                    palavraAleatoria();
                    pontosAcertos = ACERTOS;
                }else {
                    vibrar();
                    Toast.makeText(JogoLeiaBicho.this, "Você Errou!", Toast.LENGTH_SHORT).show();
                    pontosErros = ERROS;
                }
                pontuacaoJogo(pontosAcertos, pontosErros);
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

    private void pontuacaoJogo(int acertos, int erros){
        pontos[0] += acertos;
        pontos[1] += erros;
        contador ++;
        if (contador > 10) {
            alertaDialogo(pontos);
        }
    }

    public void alertaDialogo(final int[] pontos){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aprenda Brincando");
        builder.setMessage("Digite o seu nome");
        final EditText input = new EditText(this);
        builder.setView(input);
        builder.setNegativeButton("Enviar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String nome = input.getText().toString();
                Intent i = new Intent(JogoLeiaBicho.this, Score.class);
                i.putExtra("nome", nome);
                i.putExtra("pontos", pontos);
                startActivity(i);
            }
        });
        AlertDialog alerta = builder.create();
        alerta.show();
    }

    public void vibrar(){
        Vibrator vibra = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long tempo = 100; //100 milissegundos
        vibra.vibrate(tempo);
    }
}
