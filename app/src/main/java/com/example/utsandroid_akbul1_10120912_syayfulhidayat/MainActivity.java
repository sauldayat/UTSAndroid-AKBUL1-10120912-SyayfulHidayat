package com.example.utsandroid_akbul1_10120912_syayfulhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

// NAMA  : SYAYFUL HIDAYAT
// NIM   : 10120912
// Kamis, 6 Juni 2024

public class MainActivity extends AppCompatActivity {

    RadioButton radio1, radio2, hub1, hub2 ,hub3, hub4;
    RadioGroup rggrtup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fornik = (EditText) findViewById(R.id.nik);
        EditText fornama = (EditText) findViewById(R.id.nama);
        EditText lahir = (EditText) findViewById(R.id.tgl_lahir);

        radio1 = (RadioButton) findViewById(R.id.rd_laki);
        radio2 = (RadioButton) findViewById(R.id.rd_perempuan);
        hub1 = (RadioButton) findViewById(R.id.rd_ortu);
        hub2 = (RadioButton) findViewById(R.id.rd_suami);
        hub3 = (RadioButton) findViewById(R.id.rd_anak);
        hub4 = (RadioButton) findViewById(R.id.rd_kerabat);
        rggrtup = (RadioGroup) findViewById(R.id.rg1);

        Button view = (Button) findViewById(R.id.btn_simpan);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                GlobalVariable.nik = fornik.getText().toString();
                GlobalVariable.nama = fornama.getText().toString();
                GlobalVariable.tgl_lahir = lahir.getText().toString();

                if (radio1.isChecked()){
                    GlobalVariable.gender = radio1.getText().toString();
                } else {
                    GlobalVariable.gender = radio2.getText().toString();
                };

                if (hub1.isChecked()){
                    GlobalVariable.hubungan = hub1.getText().toString();
                } else if (hub2.isChecked()){
                    GlobalVariable.hubungan = hub2.getText().toString();
                }else if (hub3.isChecked()){
                    GlobalVariable.hubungan = hub3.getText().toString();
                }else {
                    GlobalVariable.hubungan = hub4.getText().toString();
                };

                Intent goToInformation = new Intent(MainActivity.this, Information.class);
                startActivity(goToInformation);

            }
        });
    }
}