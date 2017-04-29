package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ObjetoDiferente extends AppCompatActivity{

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    private int idView;

    //private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto_diferente);

        img1 = (ImageView)findViewById(R.id.img1Id);
        img2 = (ImageView) findViewById(R.id.img2Id);
        img3 = (ImageView) findViewById(R.id.img3Id);
        img4 = (ImageView) findViewById(R.id.img4Id);

        idView = numAletorio();
        imagemView(idView);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (idView == 3) {
                    Toast.makeText(ObjetoDiferente.this, "Parabéns você acertou", Toast.LENGTH_SHORT).show();
                    imagemView(numAletorio());
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (idView == 1) {
                    Toast.makeText(ObjetoDiferente.this, "Parabéns você acertou", Toast.LENGTH_SHORT).show();
                    imagemView(numAletorio());
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (idView == 2) {
                    Toast.makeText(ObjetoDiferente.this, "Parabéns você acertou", Toast.LENGTH_SHORT).show();
                    imagemView(numAletorio());
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (idView == 0) {
                    Toast.makeText(ObjetoDiferente.this, "Parabéns você acertou", Toast.LENGTH_SHORT).show();
                    imagemView(numAletorio());
                }
            }
        });
    }

    int numAletorio(){
        Random randomico = new Random();
        int num = randomico.nextInt(4);
        return  num;
    }

    private void imagemView(int rand){
        switch (rand){
            case 0:
                img1.setImageResource(R.drawable.menina_balao);
                img2.setImageResource(R.drawable.menina_balao);
                img3.setImageResource(R.drawable.menina_balao);
                img4.setImageResource(R.drawable.menina_bombole);
                break;
            case 1:
                img1.setImageResource(R.drawable.poligono_azul);
                img2.setImageResource(R.drawable.poligono_verm);
                img3.setImageResource(R.drawable.poligono_azul);
                img4.setImageResource(R.drawable.poligono_azul);
                break;
            case 2:
                img1.setImageResource(R.drawable.brincando_boneca);
                img2.setImageResource(R.drawable.brincando_boneca);
                img3.setImageResource(R.drawable.brincando_guerra);
                img4.setImageResource(R.drawable.brincando_boneca);
                break;
            case 3:
                img1.setImageResource(R.drawable.cao1);
                img2.setImageResource(R.drawable.cao2);
                img3.setImageResource(R.drawable.cao2);
                img4.setImageResource(R.drawable.cao2);
                break;
            default:
        }
        idView = rand;
    }
}
