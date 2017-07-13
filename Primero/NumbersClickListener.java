package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by juanc on 10/07/2017.
 */

    public class NumbersClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View view){
            Intent intent = new Intent(view.getContext(),NumbersActivity.class);
            view.getContext().startActivity(intent);
        }
    }