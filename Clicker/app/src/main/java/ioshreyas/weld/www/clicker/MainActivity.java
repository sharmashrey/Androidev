package ioshreyas.weld.www.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnReset;

    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.button_click);
        btnReset = (Button)findViewById(R.id.button_reset);

        txtCount = (TextView)findViewById(R.id.textViewCounter);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countNum =  txtCount.getText().toString();
                int curnum;
                curnum = Integer.parseInt(countNum);
                curnum++;
                txtCount.setText(String.valueOf(curnum));
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCount.setText("0");
            }
        });

    }
}
