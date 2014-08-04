package com.gitonway.lee.niftymodaldialogeffects;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;


public class MainActivity extends Activity{

    private Effectstype effect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dialogShow(View v){
        NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(this);

        switch (v.getId()){
            case R.id.fadein:effect=Effectstype.Fadein;break;
            case R.id.slideright:effect=Effectstype.Slideright;break;
            case R.id.slideleft:effect=Effectstype.Slideleft;break;
            case R.id.slidetop:effect=Effectstype.Slidetop;break;
            case R.id.slideBottom:effect=Effectstype.SlideBottom;break;
            case R.id.newspager:effect=Effectstype.Newspager;break;
            case R.id.fall:effect=Effectstype.Fall;break;
            case R.id.sidefall:effect=Effectstype.Sidefill;break;
            case R.id.fliph:effect=Effectstype.Fliph;break;
            case R.id.flipv:effect=Effectstype.Flipv;break;
            case R.id.rotatebottom:effect=Effectstype.RotateBottom;break;
            case R.id.rotateleft:effect=Effectstype.RotateLeft;break;
            case R.id.slit:effect=Effectstype.Slit;break;
            case R.id.shake:effect=Effectstype.Shake;break;
        }

        dialogBuilder
                .withTitle("Modal Dialog")              //.withTitle(null)  no title
                .withTitleColor("#FFFFFF")
                .withDividerColor("#11000000")
                .withMessage("This is a modal Dialog.") //.withMessage(null)  no Msg
                .withMessageColor("#FFFFFF")
                .withIcon(getResources().getDrawable(R.drawable.icon))
                .withDuration(700)
                .withEffect(effect)
                .withButton1Text("OK")
                .withButton2Text("Cancel")
                .setCustomView(R.layout.custom_view,v.getContext())         //.setCustomView(View or ResId,context)
                .setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "i'm btn1", Toast.LENGTH_SHORT).show();
                    }
                })
                .setButton2Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(),"i'm btn2",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }



    }
