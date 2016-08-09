package com.apptest.lee.apptest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment{

    ViewFlipper vf_event;
    public EventFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vf_event = (ViewFlipper) container.findViewById(R.id.vf_event);
        //Java 코드로도 ViewFlipper에 image를 넣을 수 있다.
        ImageView img = new ImageView(container.getContext());
        img.setImageResource(R.drawable.event_3);
        vf_event.addView(img,2);

        //ViewFlipper의 이미지 변경 Animation을 설정
        // [ 왼쪽으로 슬라이딩 되며 들어온다 ]
        Animation showIn = AnimationUtils.loadAnimation(container.getContext(), android.R.anim.slide_in_left);
        vf_event.setInAnimation(showIn);
        // [ 오른쪽으로 슬라이딩 되며 퇴장한다 ]
        vf_event.setOutAnimation(container.getContext(), android.R.anim.slide_out_right);

        // 1.5초 간격으로 ViewFilpper의 view를 자동 교체
        vf_event.setFlipInterval(1500);
        vf_event.startFlipping();

        return inflater.inflate(R.layout.fragment_event, container, false);
    }

}
