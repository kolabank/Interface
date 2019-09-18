package playing.kolade.com.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnThrowJab = findViewById(R.id.btnThrowJab);

        Button btnThrowCross = findViewById(R.id.btnThrowCross);


       final Boxer boxerA = new Boxer();


        btnThrowJab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, boxerA.throwJab(),Toast.LENGTH_SHORT).show();

            }
        });


        btnThrowCross.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, boxerA.throwCross(),Toast.LENGTH_SHORT).show();

                }
        });

        Log.i("tag", "what");


        Log.i("tag", "what");
    }
}
