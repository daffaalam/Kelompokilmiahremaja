package com.example.kelompokilmiahremaja;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by daffaalam on 1/14/18.
 */

public class CustomListAdafter extends ArrayAdapter<String> {

    private final Activity contex;
    private final String[] namasahabat;
    private final String[] subtitle;
    private final Integer[] gambarsahabat;


    public CustomListAdafter(Activity contex, String[] namasahabat, String[] subtitle, Integer[] gambarsahabat) {
        super(contex, R.layout.list_item, namasahabat);
        this.contex = contex;
        this.namasahabat = namasahabat;
        this.subtitle = subtitle;
        this.gambarsahabat = gambarsahabat;
    }

    public View getView(int posisi, View view, ViewGroup parent) {
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.list_item, null, true);
        TextView title = (TextView) rowview.findViewById(R.id.textview1);
        TextView subtitel1 = (TextView) rowview.findViewById(R.id.textview2);
        ImageView imagees = (ImageView) rowview.findViewById(R.id.imageview1);
        title.setText(namasahabat[posisi]);
        subtitel1.setText(subtitle[posisi]);
        imagees.setImageResource(gambarsahabat[posisi]);
        return rowview;
    }
}
