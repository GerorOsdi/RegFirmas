package com.app.regfirmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CanvasFirma cnFirma;
    ImageView viewFirma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewFirma = (View) findViewById(R.id.viewFirma);

        cnFirma = new CanvasFirma(this,null);
        setContentView(cnFirma);
        //viewFirma.setConten
    }
}