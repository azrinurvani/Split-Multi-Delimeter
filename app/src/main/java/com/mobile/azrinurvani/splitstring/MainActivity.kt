package com.mobile.azrinurvani.splitstring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Nilai asli
        var a = "IMEI:2107509092170951720;S/N:20120125701275;ICCID:892175812578912659126591"

        //String yang akan dhilangkan
        val delim1 =":"
        val delim2=";"
        val delim3 = "S/N"
        val delim4=" "
        val delim5 = "IMEI"

        //split
        var b = a.split(delim1,delim2,delim3,delim4,delim5) //--> Output dalam bentuk array
        var c = b[7]

        //lihat hasil di log
        Log.v("ADX","a = $a \n b = $b \n c=$c")

    }

}
