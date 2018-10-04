package com.tkb.boilerplate.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


import com.tkb.boilerplate.R;
import com.tkb.boilerplate.common.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class butterknifeActivity extends BaseActivity {
    
    @BindView(R.id.username) EditText username;
    @BindView(R.id.password) EditText password;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);
        
        
      
        
        
        
    }
}
