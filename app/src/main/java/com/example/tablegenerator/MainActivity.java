package com.example.tablegenerator;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextText;
    private EditText editTextText1;
    private TextView textView;
    private TextView textView1;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        editTextText1 = findViewById(R.id.editTextText1);
        textView3 = findViewById(R.id.textView3);
        textView3.setMovementMethod(new ScrollingMovementMethod());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Generating", Toast.LENGTH_SHORT).show();
                String a = editTextText.getText().toString();
                int t = Integer.parseInt(a);
                String b = editTextText1.getText().toString();
                int s = Integer.parseInt(b);

                StringBuilder sn = new StringBuilder();
                {
                    for (int i = 0; i <= s; i++) {
                        {
                            sn.append(t).append(" x ").append(i).append(" = ").append(t * i).append("\n");
                        }
                    }
                    textView3.setText(sn.toString());
                }
            }
        });
    }
}