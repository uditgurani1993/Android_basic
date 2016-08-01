package uditgurani.com.input_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView Autotxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Autotxt=(AutoCompleteTextView)findViewById(R.id.Autotxt);
        String[] Country=getResources().getStringArray(R.array.Country);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Country);
        Autotxt.setAdapter(arrayAdapter);
    }
}
