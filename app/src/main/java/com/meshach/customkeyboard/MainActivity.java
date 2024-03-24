package com.meshach.customkeyboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private EditText text3;
    private ConstraintLayout tableLayout;
    private KeyboardLayout keyboardLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textNo1);
        text2 = findViewById(R.id.textNo2);
        text3 = findViewById(R.id.textNo3);
        tableLayout = findViewById(R.id.include_keyboardLayout);

        keyboardLayout = new KeyboardLayout(this);
        keyboardLayout.initializeKeyboard(tableLayout);
    }

    public EditText getCurrentFocusedEditText() {
        View view = getCurrentFocus();
        if (view instanceof EditText) {
            return (EditText) view;
        }
        return null;
    }

}