package com.example.konversinilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiNilai extends AppCompatActivity {
EditText edTugas,edKehadiran, edUTS, edUAS, edNilaiAngka, edHuruf;
Button btHitung;
String vHuruf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_nilai);
        edTugas = findViewById(R.id.edTugas);
        edKehadiran = findViewById(R.id.edKehadiran);
        edUTS = findViewById(R.id.edUTS);
        edUAS = findViewById(R.id.edUAS);
        edNilaiAngka = findViewById(R.id.edNilaiAngka);
        edHuruf = findViewById(R.id.edHuruf);
        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tugas = Float.parseFloat(edTugas.getText().toString());
                float kehadiran = Float.parseFloat((edKehadiran.getText().toString()));

                double nilai_angka = (0.4 * tugas) + (0.6 * kehadiran);

                if(nilai_angka>=80){
                    vHuruf ="A";
                }
                else if (nilai_angka>=70){
                    vHuruf ="B";
                }else {
                    vHuruf="C";
                }

                edNilaiAngka.setText(""+ nilai_angka);
                edHuruf.setText(""+ vHuruf);

            }
        });
    }
}