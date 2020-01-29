package tn.esprit.sleam41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_count, button_toast;
    private TextView show_count;
    private int nombre=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_count = findViewById(R.id.button_count);
        button_toast = findViewById(R.id.button_toast);
        show_count = findViewById(R.id.show_count);

        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre++;
                show_count.setText(String.valueOf(nombre));
            }
        });

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_SHORT);
            }
        });

    }
}