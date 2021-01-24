package com.example.home2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editname: EditText = findViewById(R.id.user)
        var editpass: EditText = findViewById(R.id.pass)
        var editcpass: EditText = findViewById(R.id.con)
        var ok: Button = findViewById(R.id.ok)
        var clear: Button = findViewById(R.id.clear)

        clear.setOnClickListener() {
            editname.setText("")
            editpass.setText("")
            editcpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editname.text.toString()
            var pass = editpass.text.toString()
            var con = editcpass.text.toString()
            if(user == ""  ||pass == ""  ||con == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == pass && user == con) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(pass != con){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}
