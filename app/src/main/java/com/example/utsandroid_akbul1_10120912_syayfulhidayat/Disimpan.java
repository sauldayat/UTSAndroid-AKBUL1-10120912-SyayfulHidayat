package com.example.utsandroid_akbul1_10120912_syayfulhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// NAMA  : SYAYFUL HIDAYAT
// NIM   : 10120912
// Kamis, 6 Juni 2024

public class Disimpan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_disimpan);

        //Button Back Form
        Button BackForm = (Button) findViewById(R.id.btn_berhasil_simpan);
        BackForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToform();
            }
        });
    }
        public void BackToform(){
            Intent BackToform = new Intent(Disimpan.this, MainActivity.class);
            startActivity(BackToform);
        }

}