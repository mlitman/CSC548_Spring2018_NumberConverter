package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //made a change

    private TextView bitsTV;
    private TextView kbTV;
    private TextView mbTV;
    private TextView gbTV;
    private TextView tbTV;
    private TextView bytesTV;
    private TextView KBTV;
    private TextView MBTV;
    private TextView GBTV;
    private TextView TBTV;
    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView)this.findViewById(R.id.bitsTV);
        this.kbTV = (TextView)this.findViewById(R.id.kbTV);
        this.mbTV = (TextView)this.findViewById(R.id.mbTV);
        this.gbTV = (TextView)this.findViewById(R.id.gbTV);
        this.tbTV = (TextView)this.findViewById(R.id.tbTV);
        this.bytesTV = (TextView)this.findViewById(R.id.bytesTV);
        this.KBTV = (TextView)this.findViewById(R.id.KBTV);
        this.MBTV = (TextView)this.findViewById(R.id.MBTV);
        this.GBTV = (TextView)this.findViewById(R.id.GBTV);
        this.TBTV = (TextView)this.findViewById(R.id.TBTV);

        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }

    
    public void clickMeButtonPressed(View v)
    {
        String sValue = this.mbET.getText().toString();
        int MBValue = Integer.parseInt(sValue);
        double KBValue = MBValue * 1024;
        double BValue = KBValue * 1024;
        double GBValue = MBValue / 1024.0;
        double TBValue = GBValue / 1024.0;
        double bitsValue = BValue * 8;
        double kbValue = bitsValue / 1024.0;
        double mbValue = kbValue / 1024.0;
        double gbValue = mbValue / 1024.0;
        double tbValue = gbValue / 1024.0;
        this.bitsTV.setText("" + bitsValue);
        this.kbTV.setText("" + kbValue);
        this.mbTV.setText("" + mbValue);
        this.gbTV.setText("" + gbValue);
        this.tbTV.setText("" + tbValue);
        this.bytesTV.setText("" + BValue);
        this.KBTV.setText("" + KBValue);
        this.MBTV.setText("" + MBValue);
        this.GBTV.setText("" + GBValue);
        this.TBTV.setText("" + TBValue);
    }
}
