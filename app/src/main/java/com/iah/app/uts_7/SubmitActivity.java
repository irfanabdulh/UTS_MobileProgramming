package com.iah.app.uts_7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {


    public static final String intent_nama_pengirim = "nama";
    public static final String intent_pesan = "pesan";
    public static final String intent_friend = "namafriend";
    public static final Integer intent_image = 0;
    EditText ed_pesan,ed_pengirim;
    Spinner sp_friend;
    Button btn_submit;
    TextView textnamakue;
    String namakue, namafriend,pesan,namapengirim;
    Integer imgkue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        textnamakue = (TextView) findViewById(R.id.txt_namakue);
        ed_pesan=(EditText)findViewById(R.id.txt_pesan);
        ed_pengirim=(EditText)findViewById(R.id.txt_pengirim);
        btn_submit=(Button)findViewById(R.id.btn_submit);
        sp_friend=(Spinner)findViewById(R.id.sp_friend);

        final Intent intent = getIntent();
        namakue=intent.getStringExtra(IsiActivity.intent_nama);
        imgkue=intent.getIntExtra(String.valueOf(IsiActivity.intent_image),0);

        textnamakue.setText(namakue);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                namafriend=String.valueOf(sp_friend.getSelectedItem());
                pesan=String.valueOf(ed_pesan.getText());
                namapengirim=String.valueOf(ed_pengirim.getText());
                Log.d("Nama Pengirim"+namapengirim,"BLABLA");
                Intent i = new Intent(SubmitActivity.this, HasilActivity.class);


                i.putExtra(intent_friend,namafriend);
                i.putExtra(intent_nama_pengirim,namapengirim);
                i.putExtra(intent_pesan,pesan);
                i.putExtra(String.valueOf(intent_image), imgkue);

                startActivity(i);

                //Toast.makeText(getActivity(),"Yang dipilih = "+ datacheckbox,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
