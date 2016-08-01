package uditgurani.com.working_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView finalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalText=(TextView)findViewById(R.id.selecttxt);
        finalText.setEnabled(false);

    }

    public void selectFruit(View view)
    {
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.fruit_apple:
                if(checked)
                {
                    finalText.setText("You Select Apple");
                    finalText.setEnabled(true);
                }else{
                    finalText.setEnabled(false);
                }
                break;

            case R.id.fruit_grapes:
                if(checked)
                {
                    finalText.setText("You Select Grapes");
                    finalText.setEnabled(true);
                }else{
                    finalText.setEnabled(false);
                }
                break;
            case R.id.fruit_mango:
                if(checked)
                {
                    finalText.setText("You Select Mango");
                    finalText.setEnabled(true);
                }else{
                    finalText.setEnabled(false);
                }
                break;
        }

    }
}
