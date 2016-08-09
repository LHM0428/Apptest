package com.apptest.lee.apptest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CouponFragment extends Fragment {

    TableLayout tb_coupon;
    Button bt_coupon;

    public CouponFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tb_coupon = (TableLayout) container.findViewById(R.id.tb_coupon);
        bt_coupon = (Button) container.findViewById(R.id.bt_coupon);

        //쿠폰 이미지 생성
        ImageView img = new ImageView(container.getContext());
        img.setImageResource(R.drawable.couponX);

        //쿠폰을 붙여준다.
        for(int i=0; i<12; i++){
            tb_coupon.addView(img,i);
        }
        tb_coupon.setVisibility(View.INVISIBLE);

        bt_coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return inflater.inflate(R.layout.fragment_coupon, container, false);
    }

}
