package com.iah.app.uts_7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class IsiActivity extends AppCompatActivity {

    public static final String intent_nama = "nama";
    public static final Integer intent_image = 0;

    String[] namakue ={
            "Lemper",
            "Ongol-ongol",
            "Lapis Legit",
            "Onde-onde",

    };

    Integer[] imgid={
            R.drawable.lemper,
            R.drawable.ongol,
            R.drawable.legit,
            R.drawable.onde,

    };
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi_activity);

        list=(ListView)findViewById(R.id.listcake);
        AdapterKue adapter=new AdapterKue(this,namakue,imgid);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(IsiActivity.this, SubmitActivity.class);
                intent.putExtra(intent_nama,namakue[position]);
                intent.putExtra(String.valueOf(intent_image), imgid[position]);

                startActivity(intent);

            }
        });
    }
}

