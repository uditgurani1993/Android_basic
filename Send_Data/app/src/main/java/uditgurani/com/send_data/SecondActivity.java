package uditgurani.com.send_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static String MESSAGE_VALUE="uditgurani.com.send_data.message_value";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.text);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MESSAGE_VALUE);
        textView.setText(message);

    }
}
