package aprendabrincando.edvanmatta.com.aprendabrincando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
            }
        });

        botaoJogo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ObjetoDiferente.class));
            }
        });

        botaoJogo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EncontreObjeto.class));
            }
        });
    }
}
