package com.cit135.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.myradioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                switch ((radioButton.getId())) {
                    case R.id.Yesid: {
                        Log.d("RD", "Yes");
                    }
                    break;
//need to check switch statement syntax, thought breaks went inside case curley brackets
                    case R.id.Noid: {
                        Log.d("RD", "No");
                    }
                    break;

                    case R.id.Maybeid: {
                        Log.d("RD", "Maybe");
                    }
                    break;
                }
            }
        });
    }
}
