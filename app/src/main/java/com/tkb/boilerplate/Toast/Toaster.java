package com.tkb.boilerplate.Toast;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.tkb.boilerplate.common.BoilerApplication;

import es.dmoral.toasty.Toasty;

/**
 * Created by tarun on 11/18/17.
 */

public class Toaster {
    static Toaster toaster;

    private Context context = BoilerApplication.getContext();
    //private String message;
    private int length = Toast.LENGTH_LONG;

    private Toaster(){

    }
    public static Toaster init(){
        if (toaster==null){
            return new Toaster();
        }else {
            return toaster;
        }
    }
    public Toaster setContext(Activity context){
        this.context = context;
        return this;
    }

    /*public Toaster setMessage(String message){
        this.message = message;
        return this;
    }*/

    public Toaster setLength(int length){
        this.length = length;
        return this;
    }

    public void show(String message){
        Toast.makeText(context,message,length).show();
    }

    public void succcess(String message){
        Toasty.success(context, message, Toast.LENGTH_SHORT, true).show();

    }
}
