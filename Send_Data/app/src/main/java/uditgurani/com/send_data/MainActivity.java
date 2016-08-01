package uditgurani.com.send_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText message_text;
    public final static String MESSAGE_VALUE="uditgurani.com.send_data.message_value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        message_text=(EditText)findViewById(R.id.edit);
        String message=message_text.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra(MESSAGE_VALUE,message);
        startActivity(intent);

    }
}
