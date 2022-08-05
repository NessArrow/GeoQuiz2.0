package com.nessarrow.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                showToast(R.string.correct_toast);
            }
        });

        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                showToast(R.string.incorrect_toast);
            }
        });
    }

    protected void showToast(int text) {
        Toast t = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
//        t.setMargin(0, 40);
        t.setGravity(Gravity.TOP, 0,0);
        t.show();
    }
}