package uditgurani.com.listview_highlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] Country={"INDIA","PAKISTAN","USA","AMERICA"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listview_ownlayout,R.id.list_view,Country);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position) +" is selected",Toast.LENGTH_LONG).show();
                Log.d("Message",""+parent);
            }
        });
    }
}
