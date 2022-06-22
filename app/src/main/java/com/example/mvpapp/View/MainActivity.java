package com.example.mvpapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpapp.Model.Mahasiswa;
import com.example.mvpapp.Presenter.RumusPresenterImp;
import com.example.mvpapp.Presenter.RumusView;
import com.example.mvpapp.R;

public class MainActivity extends AppCompatActivity implements RumusView {

    private EditText etPanjang, etLebar;
    private TextView tvHasil,tvHasilLuas;
    private Button btnHitung;
    private RumusPresenterImp rumusPresenterImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        btnHitung = findViewById(R.id.BtnHitung);
        tvHasil = findViewById(R.id.tvHasil);
        tvHasilLuas = findViewById(R.id.tvHasilLuas);
        rumusPresenterImp = new RumusPresenterImp(this);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Panjang = Double.valueOf(etPanjang.getText().toString());
                Double Lebar = Double.valueOf(etLebar.getText().toString());

                rumusPresenterImp.hitungLuas(Panjang, Lebar);
                rumusPresenterImp.hitungKeliling(Panjang,Lebar);
            }
        });
//
//        Mahasiswa mahasiswa = new Mahasiswa("Aqsal", "Yogya", "D3MI");
    }

    @Override
    public void hasilLuas(Double hasilLuas) {
        tvHasil.setText(hasilLuas.toString());
    }

    @Override
    public void hasilKeliling(Double hasilKeliling) {
        tvHasilLuas.setText(hasilKeliling.toString());

    }
}