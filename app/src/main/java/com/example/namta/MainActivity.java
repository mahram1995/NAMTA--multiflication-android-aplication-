package com.example.namta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText number;
    private Button ok;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get all view
        number=findViewById(R.id.number);
        ok=findViewById(R.id.ok);
        textView=findViewById(R.id.textView);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StringBuilder stb= new StringBuilder();
        int n=Integer.parseInt(number.getText().toString());

        for (int i=1; i<11 ; i++){

            String changeNumber=String.valueOf(i);
            int total=i*n;
            String value=String.valueOf(total);

            if(i<10){
                stb.append(number.getText().toString() + " X 0" + changeNumber + " = " + value + "\n" );
            }else {
                stb.append(number.getText().toString() + " X " + changeNumber + " = " + value + "\n");
            }
        }

        textView.setText(stb.toString());
    }
}