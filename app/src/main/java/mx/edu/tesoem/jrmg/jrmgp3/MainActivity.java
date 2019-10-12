package mx.edu.tesoem.jrmg.jrmgp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btonsig;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btonsig = (Button) findViewById(R.id.button);
        btonsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent sig = new Intent(this,Frm2Activity.class);
        startActivity(sig);
        finish();
    }
}
