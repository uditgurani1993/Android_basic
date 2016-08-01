package uditgurani.com.working_togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView txtView;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView=(TextView)findViewById(R.id.text);
        aSwitch=(Switch)findViewById(R.id.Switch);
        txtView.setEnabled(false);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    txtView.setText("Switch ON");
                    txtView.setEnabled(true);
                }
                else {
                    txtView.setText("Switch OFF");
                    txtView.setEnabled(true);
                }
            }
        });

    }
    public void toggleButton(View view)
    {
        boolean checked=((ToggleButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.Tbutton:
                if(checked)
                {
                    txtView.setText("Vibrate On");
                    txtView.setEnabled(true);
                }else
                {
                 txtView.setText("Vibrate OFF");
                    txtView.setEnabled(true);
                }
        }
    }
}
