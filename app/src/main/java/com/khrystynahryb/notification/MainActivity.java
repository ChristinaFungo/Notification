package com.khrystynahryb.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment1 frag1;
    Fragment2 frag2;
    Fragment3 frag3;
    Fragment4 frag4;
    Fragment5 frag5;
    FragmentTransaction fTrans;
    FragmentManager fragmentmanager;
    ImageView iv_remote_1;
    ImageView iv_remote_2;
    ImageView iv_remote_3;
    ImageView iv_remote_4;
    ImageView iv_add_1;
    ImageView iv_add_2;
    ImageView iv_add_3;
    ImageView iv_add_4;
    TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initElements();
        initListerens();

    }

    private void initListerens() {
        iv_remote_1.setOnClickListener(this);
        iv_remote_2.setOnClickListener(this);
        iv_remote_3.setOnClickListener(this);
        iv_remote_4.setOnClickListener(this);
        iv_add_1.setOnClickListener(this);
        iv_add_2.setOnClickListener(this);
        iv_add_3.setOnClickListener(this);
        iv_add_4.setOnClickListener(this);
    }

    private void initElements() {
        frag1 = new Fragment1();
        frag2 = new Fragment2();
        frag3 = new Fragment3();
        frag4 = new Fragment4();
        frag5 = new Fragment5();
        tv_text = findViewById(R.id.tv_text);
        fragmentmanager = getSupportFragmentManager();
        iv_remote_1 = (ImageView) findViewById(R.id.iv_remote_1);
        iv_remote_2 = (ImageView) findViewById(R.id.iv_remote_2);
        iv_remote_3 = (ImageView) findViewById(R.id.iv_remote_3);
        iv_remote_4 = (ImageView) findViewById(R.id.iv_remote_4);
        iv_add_1 = (ImageView) findViewById(R.id.iv_add_1);
        iv_add_2 = (ImageView) findViewById(R.id.iv_add_2);
        iv_add_3 = (ImageView) findViewById(R.id.iv_add_3);
        iv_add_4 = (ImageView) findViewById(R.id.iv_add_4);
    }

    public void onClick(View v) {
        fTrans = fragmentmanager.beginTransaction();
        switch (v.getId()) {
            case R.id.iv_add_1:
                fTrans.replace(R.id.frgmCont, frag2);
                tv_text.setText("2");
                iv_remote_1.setVisibility(View.VISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.VISIBLE);
                iv_add_3.setVisibility(View.INVISIBLE);
                iv_add_4.setVisibility(View.INVISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_add_2:
                tv_text.setText("3");
                fTrans.replace(R.id.frgmCont, frag3);
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.VISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                iv_add_3.setVisibility(View.VISIBLE);
                iv_add_4.setVisibility(View.INVISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_add_3:
                tv_text.setText("4");
                fTrans.replace(R.id.frgmCont, frag4);
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.VISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                iv_add_3.setVisibility(View.INVISIBLE);
                iv_add_4.setVisibility(View.VISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_add_4:
                tv_text.setText("5");
                fTrans.replace(R.id.frgmCont, frag5);
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.VISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                //iv_add_3.setVisibility(View.VISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_remote_1:
                tv_text.setText("1");
                fTrans.remove(frag2);
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.VISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                iv_add_3.setVisibility(View.INVISIBLE);
                iv_add_4.setVisibility(View.INVISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_remote_2:
                fTrans.replace(R.id.frgmCont, frag2);
                tv_text.setText("2");
                iv_remote_1.setVisibility(View.VISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.VISIBLE);
                iv_add_3.setVisibility(View.INVISIBLE);
                iv_add_4.setVisibility(View.INVISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_remote_3:
                fTrans.replace(R.id.frgmCont, frag3);
                tv_text.setText("3");
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.VISIBLE);
                iv_remote_3.setVisibility(View.INVISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                iv_add_3.setVisibility(View.VISIBLE);
                iv_add_4.setVisibility(View.INVISIBLE);
                fTrans.commit();
                break;
            case R.id.iv_remote_4:
                fTrans.replace(R.id.frgmCont, frag4);
                tv_text.setText("4");
                iv_remote_1.setVisibility(View.INVISIBLE);
                iv_remote_2.setVisibility(View.INVISIBLE);
                iv_remote_3.setVisibility(View.VISIBLE);
                iv_remote_4.setVisibility(View.INVISIBLE);
                iv_add_1.setVisibility(View.INVISIBLE);
                iv_add_2.setVisibility(View.INVISIBLE);
                iv_add_3.setVisibility(View.INVISIBLE);
                iv_add_4.setVisibility(View.VISIBLE);
                fTrans.commit();
                break;
            default:
                break;
        }
    }
}