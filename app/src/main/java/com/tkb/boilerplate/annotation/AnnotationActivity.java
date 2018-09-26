package com.tkb.boilerplate.annotation;


import android.support.constraint.ConstraintLayout;


import com.tkb.boilerplate.R;
import com.tkb.boilerplate.common.BaseActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_annotation)
public class AnnotationActivity extends BaseActivity {

    @ViewById
    ConstraintLayout main;

    @AfterViews
    void afterViews() {

    }
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
    }*/
}
