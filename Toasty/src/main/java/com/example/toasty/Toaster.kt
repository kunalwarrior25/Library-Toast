package com.example.toasty

import android.content.Context
import android.widget.Toast

public class Toaster {
    companion object {
        fun Simpletoast(context: Context,msg:String) {
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }
}