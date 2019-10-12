package mx.edu.tesoem.jrmg.jrmgp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class Frm2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);

        btnsig = (Button) findViewById(R.id.button2);
        btnsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent sig = new Intent(this,Frm3Activity.class);
        startActivity(sig);
        finish();
    }
}
