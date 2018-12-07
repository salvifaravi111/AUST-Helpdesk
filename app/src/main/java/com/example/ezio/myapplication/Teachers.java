package com.example.ezio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Teachers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);


        TextView t=(TextView)findViewById(R.id.tinfo);

        t.setText("Dr.S.M.A.Al-Mamun–01912073524\n\nMr.Md.Khairul Hasan–01711109629\n\nDr.Mohammad Shafiul Alam–01937653901\n\nMr.Mohammad Mominul Hoque\n\nMs.Umme Zakia–01722066975\n\nMr.Faisal Muhammad Shah–01911090363\n\nMs.Nusrat Jahan Lisa–01674928298\n\nMs.Qamrun Nahar Eity–01680033969\n\nMr.Tanvir Ahmed–01747584067\n\nMr.Md.Wasi Ul Kabir–01670014863\n\nDr.Tanzilur Rahman–01879462452\n\nMs.Syeda Shabnam Hasan–01914130189\n\nMr.Emam Hossain–01717584978\n\nMs.Shanjida Khatun–01919835477\n\nMr.Md.Hosne-Al-Walid Shaiket–01737060069\n\nMr.Nazmus Sakib–01939900271\n\nMr.D.M.Anisuzzaman–01676442389\n\nMs.Raqeebir Rab–01779001291\n\nMr.Ahasanuzzaman–01675570849\n\nMr.Tanveer Ahmed Belal–01671989204\n\nMr.M.Arif Imtiazur Rahman–01914027474\n\nMr.Saikat Chakraborty–01737450085\n\nMs.Tahsin Aziz–01712019558\n\nMs.Ridi Hossain–01671456916\n\nMs.Asma Enayet–01710396686\n\nMr.Mubin Ul Haque–01671733713\n\nMr.Aminur Rahman–01681646953\n\nMr.Shoeb Mohammad Shahriar–01917256784\n\nMr.Md.Taksir Hasan Majumder–01704750136");

    }



}
