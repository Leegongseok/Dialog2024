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
            var dialog=AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("안내메시지")
            dialog.setMessage("오늘은 목요일입니다.")
            dialog.setIcon(R.drawable.ikon)
            dialog.setPositiveButton("확인"){dialog,which->
                Toast.makeText(this@MainActivity,
                    "확인을 눌렀네요",Toast.LENGTH_SHORT).show()

            }
            dialog.show()
        }
    }
}