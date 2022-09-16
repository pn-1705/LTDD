package com.example.bmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edittext_weight, edittext_height, edittext_resultBMI;
    Button button_resultBMI;
    Float w, h, bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_weight = (EditText) findViewById(R.id.edt_weight);
        edittext_height = (EditText) findViewById(R.id.edt_height);
        edittext_resultBMI = (EditText) findViewById(R.id.edt_resultBMI);
        button_resultBMI = (Button) findViewById(R.id.btn_resultBMI);
        button_resultBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 w = Float.parseFloat(edittext_weight.getText().toString());
                 h = Float.parseFloat(edittext_height.getText().toString());

                bmi = w / h / h;

                if(bmi < 18){
                    edittext_resultBMI.setText("Người gầy");
                }else{
                    if(bmi < 25){
                        edittext_resultBMI.setText("Người bình thường");
                    }else{
                        if(bmi < 30){
                            edittext_resultBMI.setText("Người béo phì độ I");
                        }else{
                            if(bmi < 35){
                                edittext_resultBMI.setText("Người béo phì độ II");
                            }else{
                                edittext_resultBMI.setText("Người béo phì độ III");
                            }
                        }
                    }
                }
            }
        });
    }
}