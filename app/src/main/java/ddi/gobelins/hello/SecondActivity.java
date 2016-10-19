package ddi.gobelins.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String text = intent.getStringExtra("name");

        Log.d("SecondActivity", "received text through intent: " + text);

        TextView textView = (TextView) findViewById(R.id.second_name);
        textView.setText(text);
    }
}
