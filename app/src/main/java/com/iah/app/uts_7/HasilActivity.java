package com.iah.app.uts_7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {


    TextView txt_penerima,txt_pengirim,txt_pesan;
    ImageView imgkue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        txt_penerima=(TextView)findViewById(R.id.txt_Penerima);
        txt_pengirim=(TextView)findViewById(R.id.txt_pengirim);
        txt_pesan=(TextView)findViewById(R.id.txt_pesan);
        imgkue=(ImageView) findViewById(R.id.img_kue);


        final Intent intent = getIntent();
        txt_pengirim.setText("From : "+intent.getStringExtra(SubmitActivity.intent_nama_pengirim));
        Log.d("Hasil ",intent.getStringExtra(SubmitActivity.intent_nama_pengirim));
        txt_penerima.setText("To : "+intent.getStringExtra(SubmitActivity.intent_friend));
        txt_pesan.setText(intent.getStringExtra(SubmitActivity.intent_pesan));
        imgkue.setImageResource(intent.getIntExtra(String.valueOf(SubmitActivity.intent_image),0));





    }

}
