package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class EncontreObjeto extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgPrincipal;
    private ImageView imgDez;
    private ImageView imgLapis;
    private ImageView imgOculos;
    private ImageView imgLixo;
    private ImageView imgNove;
    private ImageView imgOito;
    private ImageView imgSeis;
    private ImageView imgCamera;
    private ImageView imgCadeira;
    private ImageView imgBanheira;
    private ImageView imgPinto;

    private String[] views = {"banheira", "cadeira", "camera", "dez", "seis", "oito", "nove", "lixo", "oculos", "lapis", "pintinho"};
    private int imgViewPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontre_objeto);

        imgPrincipal = (ImageView) findViewById(R.id.imgPrincipalID);
        imgBanheira = (ImageView) findViewById(R.id.imgBanheiraID);
        imgCadeira = (ImageView) findViewById(R.id.imgCadeiraID);
        imgCamera = (ImageView) findViewById(R.id.imgCameraID);
        imgDez = (ImageView) findViewById(R.id.imgDezID);
        imgLapis = (ImageView) findViewById(R.id.imgLapisID);
        imgLixo = (ImageView) findViewById(R.id.imgLixeiraID);
        imgNove = (ImageView) findViewById(R.id.imgNoveID);
        imgOculos = (ImageView) findViewById(R.id.imgOculosID);
        imgOito = (ImageView) findViewById(R.id.imgOitoID);
        imgSeis = (ImageView) findViewById(R.id.imgSeisID);
        imgPinto = (ImageView) findViewById(R.id.imgPintoID);

        imgPrincipal.setImageResource(imagemView(numAletorio()));

        imgBanheira.setOnClickListener(this);
        imgCadeira.setOnClickListener(this);
        imgCamera.setOnClickListener(this);
        imgDez.setOnClickListener(this);
        imgLapis.setOnClickListener(this);
        imgLixo.setOnClickListener(this);
        imgNove.setOnClickListener(this);
        imgOculos.setOnClickListener(this);
        imgOito.setOnClickListener(this);
        imgSeis.setOnClickListener(this);
        imgPinto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.imgBanheiraID:
                if(imgViewPrincipal == R.drawable.banheira) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgCadeiraID:
                if(imgViewPrincipal == R.drawable.cadeira) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgCameraID:
                if(imgViewPrincipal == R.drawable.camera) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgDezID:
                if(imgViewPrincipal == R.drawable.dez) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgLapisID:
                if(imgViewPrincipal == R.drawable.lapis) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgLixeiraID:
                if(imgViewPrincipal == R.drawable.lixeira) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgNoveID:
                if(imgViewPrincipal == R.drawable.nove) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgOculosID:
                if(imgViewPrincipal == R.drawable.oculos) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgOitoID:
                if(imgViewPrincipal == R.drawable.oito) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgSeisID:
                if(imgViewPrincipal == R.drawable.seis) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            case R.id.imgPintoID:
                if(imgViewPrincipal == R.drawable.pintinho) {
                    Toast.makeText(EncontreObjeto.this, "Parabéns Você Acertou!", Toast.LENGTH_SHORT).show();
                    imgPrincipal.setImageResource(imagemView(numAletorio()));
                }
                break;
            default:
        }
    }

    private int numAletorio() {
        Random randomico = new Random();
        int num = randomico.nextInt(10);
        return num;
    }

    private int imagemView(int rand) {
        int objeto = -1;

        switch (views[rand]) {
            case "banheira":
                objeto = R.drawable.banheira;
                break;
            case "cadeira":
                objeto = R.drawable.cadeira;
                break;
            case "camera":
                objeto = R.drawable.camera;
                break;
            case "dez":
                objeto = R.drawable.dez;
                break;
            case "lapis":
                objeto = R.drawable.lapis;
                break;
            case "lixo":
                objeto = R.drawable.lixeira;
                break;
            case "nove":
                objeto = R.drawable.nove;
                break;
            case "oculos":
                objeto = R.drawable.oculos;
                break;
            case "oito":
                objeto = R.drawable.oito;
                break;
            case "seis":
                objeto = R.drawable.seis;
                break;
            case "pintinho":
                objeto = R.drawable.pintinho;
                break;
            default:
        }
        imgViewPrincipal = objeto;
        return objeto;
    }
}
