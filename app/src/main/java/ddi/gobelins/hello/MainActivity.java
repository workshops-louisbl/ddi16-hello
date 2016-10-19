package ddi.gobelins.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mainEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.main_button);
        button.setOnClickListener(this);

        mainEditText = (EditText) findViewById(R.id.main_name);
    }

    @Override
    public void onClick(View view) {
        String text = mainEditText.getText().toString();
        Log.d("MainActivity", "on main button clicked: " + text);
    }
}
