package uditgurani.com.working_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selection=new ArrayList<String>();
    TextView selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedItem=(TextView)findViewById(R.id.selectedItem);
        selectedItem.setEnabled(false);
    }

    public void selectItem(View view)
    {
        Boolean checked=((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.Apple:
                if(checked)
                {
                    selection.add("Apple");
                }else
                {
                    selection.remove("Apple");
                }
                break;
            case R.id.Mango:
                if(checked)
                {
                    selection.add("Mango");
                }else
                {
                    selection.remove("Mango");
                }
                break;
            case R.id.Banana:
                if(checked)
                {
                    selection.add("Banana");
                }else
                {
                    selection.remove("Banana");
                }
                break;
        }

    }
    public void finalSelection(View view)
    {
        String final_fruit_selection="";
        for (String Selections: selection)
        {
            final_fruit_selection=final_fruit_selection + Selections +"\n";
        }
        selectedItem.setText(final_fruit_selection);
        selectedItem.setEnabled(true);
    }
}
