package com.meshach.customkeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KeyboardLayout extends AppCompatActivity implements View.OnClickListener {

    private Button buttonQ;
    private Button buttonW;
    private Button buttonE;
    private Button buttonR;
    private Button buttonT;
    private Button buttonY;
    private Button buttonU;
    private Button buttonI;
    private Button buttonO;
    private Button buttonP;

    private Button buttonA;
    private Button buttonS;
    private Button buttonD;
    private Button buttonF;
    private Button buttonG;
    private Button buttonH;
    private Button buttonJ;
    private Button buttonK;
    private Button buttonL;

    private Button buttonZ;
    private Button buttonX;
    private Button buttonC;
    private Button buttonV;
    private Button buttonB;
    private Button buttonN;
    private Button buttonM;

    private Button btnDel;

    private MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initializeKeyboard(View view) {

        buttonQ = view.findViewById(R.id.Q);
        buttonQ.setOnClickListener(this);

        buttonW = view.findViewById(R.id.W);
        buttonW.setOnClickListener(this);

        buttonE = view.findViewById(R.id.E);
        buttonE.setOnClickListener(this);

        buttonR = view.findViewById(R.id.R);
        buttonR.setOnClickListener(this);

        buttonT = view.findViewById(R.id.T);
        buttonT.setOnClickListener(this);

        buttonY = view.findViewById(R.id.Y);
        buttonY.setOnClickListener(this);

        buttonU = view.findViewById(R.id.U);
        buttonU.setOnClickListener(this);

        buttonI = view.findViewById(R.id.I);
        buttonI.setOnClickListener(this);

        buttonO = view.findViewById(R.id.O);
        buttonO.setOnClickListener(this);

        buttonP = view.findViewById(R.id.P);
        buttonP.setOnClickListener(this);

        //Second Row
        buttonA = view.findViewById(R.id.A);
        buttonA.setOnClickListener(this);

        buttonS = view.findViewById(R.id.S);
        buttonS.setOnClickListener(this);

        buttonD = view.findViewById(R.id.D);
        buttonD.setOnClickListener(this);

        buttonF = view.findViewById(R.id.F);
        buttonF.setOnClickListener(this);

        buttonG = view.findViewById(R.id.G);
        buttonG.setOnClickListener(this);

        buttonH = view.findViewById(R.id.H);
        buttonH.setOnClickListener(this);

        buttonJ = view.findViewById(R.id.J);
        buttonJ.setOnClickListener(this);

        buttonK = view.findViewById(R.id.K);
        buttonK.setOnClickListener(this);

        buttonL = view.findViewById(R.id.L);
        buttonL.setOnClickListener(this);


        //Third Row
        buttonZ = view.findViewById(R.id.Z);
        buttonZ.setOnClickListener(this);

        buttonX = view.findViewById(R.id.X);
        buttonX.setOnClickListener(this);

        buttonC = view.findViewById(R.id.C);
        buttonC.setOnClickListener(this);

        buttonV = view.findViewById(R.id.V);
        buttonV.setOnClickListener(this);

        buttonB = view.findViewById(R.id.B);
        buttonB.setOnClickListener(this);

        buttonN = view.findViewById(R.id.N);
        buttonN.setOnClickListener(this);

        buttonM = view.findViewById(R.id.M);
        buttonM.setOnClickListener(this);

        btnDel = view.findViewById(R.id.ButtonDel);
        btnDel.setOnClickListener(this::onClick);


    }

    @Override
    public void onClick(View view) {

        EditText currentEditText = mainActivity.getCurrentFocusedEditText();

        if (view instanceof Button) {

            if (view == btnDel) {
                String textString = currentEditText.getText().toString();
                if (!textString.isEmpty()) { // Check if EditText is not empty
                    currentEditText.setText(textString.substring(0, textString.length() - 1)); // Remove the last character from the text
                    currentEditText.setSelection(textString.length() - 1);
                }
            }
                String text = ((Button) view).getText().toString();
            currentEditText.append(text);
        }
        else {
            return;
        }
    }

    public KeyboardLayout(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

}