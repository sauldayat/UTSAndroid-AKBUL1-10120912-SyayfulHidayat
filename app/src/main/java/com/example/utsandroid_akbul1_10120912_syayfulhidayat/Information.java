package com.example.utsandroid_akbul1_10120912_syayfulhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// NAMA  : SYAYFUL HIDAYAT
// NIM   : 10120912
// Kamis, 6 Juni 2024

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_information);

        TextView nik_o = (TextView) findViewById(R.id.i_nik);
        TextView nama_o = (TextView) findViewById(R.id.i_nama);
        TextView lahir_o = (TextView) findViewById(R.id.i_tgl_lahir);
        TextView jk = (TextView) findViewById(R.id.i_jeniskelamin);
        TextView hub = (TextView) findViewById(R.id.i_hubungan);

        nik_o.setText(GlobalVariable.nik);
        nama_o.setText(GlobalVariable.nama);
        lahir_o.setText(GlobalVariable.tgl_lahir);
        jk.setText(GlobalVariable.gender);
        hub.setText(GlobalVariable.hubungan);

        //save Button
        Button saveButton = (Button) findViewById(R.id.btn_simpan2);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisimpanActivity();
            }
        });

      //Ubah Button
      Button ubahButton = (Button) findViewById(R.id.btn_ubah);
      ubahButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ubahToRegistrasi();
          }
      });
    }

    public void openDisimpanActivity() {
        Intent goToSimpan = new Intent(Information.this, Disimpan.class);
        startActivity(goToSimpan);
    }
    public void ubahToRegistrasi() {
        Intent goToubah = new Intent(Information.this, MainActivity.class);
        startActivity(goToubah);
    }
}