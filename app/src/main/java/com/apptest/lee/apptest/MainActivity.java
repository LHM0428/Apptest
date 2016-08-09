package com.apptest.lee.apptest;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends FragmentActivity {

    final String TAG = "MainActivity";
    int mCurrentFragmentIdx; // 현재 Fragment Index를 받는 인수;
    public final static int FRAGMENT_COVER = 0; // COVER Fragment 상수 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCurrentFragmentIdx = FRAGMENT_COVER;
        fragmentReplace(mCurrentFragmentIdx);
    }
    // fragment를 바꾸기 위한 메소드
    public void fragmentReplace(int replaceFragmentIdx){
        Fragment newFragment = null;
        newFragment = getFragment(replaceFragmentIdx);

        Log.d(TAG, "fragment Replace : "+ replaceFragmentIdx);

        //fragment를 바꾼다.
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, newFragment);
        transaction.commit();
    }
    // fragment 인덱스를 fragment를 통해 받아오기 위한 메소드
    private Fragment getFragment(int idx) {
        Fragment newFragment = null;

        switch (idx){
            case FRAGMENT_COVER :
                newFragment = new CoverFragment();
                break;
        }
        return  newFragment;
    }

    public void imageClicked(View view){

        Intent intent = new Intent(this,LoginActivity.class);
        intent.putExtra("하아아이",true);
        this.startActivity(intent);
    }

}
