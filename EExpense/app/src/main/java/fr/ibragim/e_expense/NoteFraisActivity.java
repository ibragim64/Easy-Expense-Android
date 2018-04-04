package fr.ibragim.e_expense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoteFraisActivity extends AppCompatActivity {
    private EditText noteDate;
    private EditText noteComment;
    private EditText DistanceKM;
    private Button noteSubmit;

    private final String url = "https://e-expense.000webhostapp.com/Android.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_frais);

        noteDate = findViewById(R.id.noteDate);
        noteComment = findViewById(R.id.noteComment);
        DistanceKM = findViewById(R.id.noteDistance);
        noteSubmit = findViewById(R.id.noteSubmit);



        noteSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
