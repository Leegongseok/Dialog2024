package kr.ac.kopo.dialog2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog=findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener{
            var snackArray= arrayOf("오레오","파이","바나나킥")
            var dialog=AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("맜있는과자")
            dialog.setIcon(R.drawable.ikon)
            dialog.setItems(snackArray){d1,which->
                btnDialog.text=snackArray[which]
            }
            dialog.setPositiveButton("닫기",null)
            dialog.show()
        }
    }
}