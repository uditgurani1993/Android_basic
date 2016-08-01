package uditgurani.com.multiple_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view)
    {
        String button_txt;
        button_txt=((Button)view).getText().toString();
        if (button_txt.equals("SecondActivity")){
            Intent intent=new Intent(this,SecondActivity.class);
            startActivity(intent);
        }else if (button_txt.equals("ThirdActivity"))
        {
            Intent intent=new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }
    }
}
