package tn.esprit.sleam41;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mShow_count;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShow_count = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShow_count != null) mShow_count.setText(Integer.toString(mCount));
    }
}