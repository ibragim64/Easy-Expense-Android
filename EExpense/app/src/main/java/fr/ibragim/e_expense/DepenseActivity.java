package fr.ibragim.e_expense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepenseActivity extends AppCompatActivity {

    private Button btnFrais;
    private Button btnTrajet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depense);
        btnFrais = findViewById(R.id.btnFrais);
        btnTrajet = findViewById(R.id.btnTrajet);







    }


}
