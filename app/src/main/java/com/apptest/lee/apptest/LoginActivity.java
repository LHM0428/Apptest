package com.apptest.lee.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    EditText idEdit, passEdit;
    Button loginBtn, joinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_cover);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        joinBtn = (Button) findViewById(R.id.joinBtn);

        loginBtn.setOnClickListener(this);
        joinBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        System.out.println("onClick이심2");

        if (v.getId() == loginBtn.getId()) {
           // Toast.makeText(v.getContext(), "으하?로그인 ㅂ튼", Toast.LENGTH_LONG).show();



            //sql 모델을 호출!!한다는것?
        } else if (v.getId() == joinBtn.getId()) {
            Toast.makeText(v.getContext(), "이건 회원가입 버튼이지", Toast.LENGTH_LONG).show();

        }

    }
}
