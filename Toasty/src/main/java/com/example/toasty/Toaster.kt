package com.example.toasty

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun simpletoast(context: Context,msg:String) {
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }
}