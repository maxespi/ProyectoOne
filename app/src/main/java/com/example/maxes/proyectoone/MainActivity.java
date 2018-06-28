package com.example.maxes.proyectoone;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    int ladrillo = 0;
    int madera = 0;

    public void buttonBoton1(View view) {
        Toast.makeText(MainActivity.this,"+1",Toast.LENGTH_SHORT).show();
        ladrillo++;
        findViewById(R.id.txtLadrillo);
        ((TextView)findViewById(R.id.txtLadrillo)).setText(String.valueOf(ladrillo));
    }
    public void buttonBoton2(View view) {
        Toast.makeText(MainActivity.this,"-1",Toast.LENGTH_SHORT).show();
        ladrillo--;
        ((TextView)findViewById(R.id.txtLadrillo)).setText(String.valueOf(ladrillo));
    }
    public void buttonBoton3(View view) {
        Toast.makeText(MainActivity.this,"+1",Toast.LENGTH_SHORT).show();
        madera++;
        ((TextView)findViewById(R.id.txtMadera)).setText(String.valueOf(madera));

    }
    public void buttonBoton4(View view) {
        Toast.makeText(MainActivity.this,"-1",Toast.LENGTH_SHORT).show();
        madera--;
        ((TextView)findViewById(R.id.txtMadera)).setText(String.valueOf(madera));
    }
}
