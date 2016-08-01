package uditgurani.com.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.text);
    }
    public void sendMessage(View view)
    {
        String message="this is my first Android Program";
        text.setText(message);
    }
}
