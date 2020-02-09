package com.example.problem4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btn;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        i=0;
    }

    public void ButtonPressed(View view)
    {
        i++;
        if (i%7!=0)
        {
            btn.setText("This is the click number: " + i);
        }
        else
        {
            btn.setText("BOOM");
        }
    }
}
