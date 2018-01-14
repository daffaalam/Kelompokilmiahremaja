package com.example.kelompokilmiahremaja;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SahabatNabi extends AppCompatActivity {

    String[] namasahabat = {
            "Abu bakar as shiddiq",
            "Ali bin Abi tholib",
            "Ukhalid bin Walid",
            "Ummar bin Khattab",
            "Usman bin Affan",
            "Bilal bin rabah",
            "Abbas bin abdul muthalib",
            "Abdullah bin mas'ud",
            "Zubair bin awwam",
            "Abu sufyan bin harits"


    };

    Integer[] gambarsahabat = {
            R.drawable.abu,
            R.drawable.ali,
            R.drawable.khalid,
            R.drawable.umar,
            R.drawable.usman,
            R.drawable.bilal,
            R.drawable.abas,
            R.drawable.masud,
            R.drawable.zubair,
            R.drawable.abusufyan


    };

    String[] subtitle = {
            "(al-shiddiq atau jujur dan membenarkan)",
            "(gerban ilmu)",
            "(saifullah Al Maslul atau pandang Allah yang terhunus ",
            "(Al faruq atau sang pembela)",
            "(cendekiawan muslim yang paling tahu mana yang haram dan mana yang halal)",
            "(Dzun nurain atau dua cahaya)",
            "(Muadzin Rasululllah)",
            "(pengurus air minum makkah dan madinah)",
            "(peti rahasia rosul dan shahibus sirri raasulullah)",
            "(pembela rusulullah)",
            "(ketua pemuda surga)"

    };

    String[] url = {
            "https://islamislami.com/2017/04/23/biografi-lengkap-dan-kisah-inspiratif-abu-bakar-ash-shiddiq-sang-khulafaur-rasyidin/",
            "https://suaramuslim.net/biografi-ali-bin-abi-thalib/",
            "https://edywitanto.wordpress.com/2010/11/29/khalid-ibnul-walid/",
            "https://mahluktermulia.wordpress.com/2010/04/17/umar-bin-khattab/",
            "http://kisahmuslim.com/4066-keutamaan-utsman-bin-affan.html",
            "https://edywitanto.wordpress.com/2010/11/06/bilal-bin-rabah/#more-1427",
            "https://edywitanto.wordpress.com/2010/12/09/abbas-bin-abdul-muthalib/",
            "https://buletinmitsal.wordpress.com/sosok/abdullah-bin-mas%E2%80%99ud/",
            "https://edywitanto.wordpress.com/2010/12/02/zubair-bin-awwam/",
            "https://edywitanto.wordpress.com/2010/12/09/abu-sufyan-bin-harits/"


    };

    ListView list;
    AlertDialog.Builder alert1;
    AlertDialog alert2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahabat_nabi);

        CustomListAdafter cladafter = new CustomListAdafter(this, namasahabat, subtitle, gambarsahabat);
        list = (ListView) findViewById(R.id.list1);
        list.setAdapter(cladafter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int posisi, long id) {
                alert1 = new AlertDialog.Builder(SahabatNabi.this);
                alert1
                        .setTitle(namasahabat[posisi])
                        .setMessage("Sahabat yang anda pilih adalah" + namasahabat[posisi])
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String title = namasahabat[posisi];
                                Integer gambar = gambarsahabat[posisi];
                                String subtitle1 = subtitle[posisi];
                                String url1 = url[posisi];

                                Bundle ngambil = new Bundle();
                                ngambil.putString("judul", title);
                                ngambil.putInt("gambar", gambar);
                                ngambil.putString("subjudul", subtitle1);
                                ngambil.putString("url", url1);


                                Intent kirim = new Intent(SahabatNabi.this, detailactivty.class);
                                kirim.putExtras(ngambil);
                                startActivity(kirim);

                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                alert2 = alert1.create();
                alert2.show();
            }
        });
    }
}
