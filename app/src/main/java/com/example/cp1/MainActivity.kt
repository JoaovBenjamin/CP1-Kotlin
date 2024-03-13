package com.example.cp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    lateinit var cxHomem : RadioButton
    lateinit var cxMulher: RadioButton
    lateinit var calcImc : Button
    lateinit var altura : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        altura = findViewById(R.id.txtAltura)
        cxHomem = findViewById(R.id.cxHomem)
        cxMulher = findViewById(R.id.cxMulher)
       calcImc = findViewById(R.id.button)


        calcImc.setOnClickListener{
            var mensagem = " "
            val alt = altura.text.toString().toDouble()
            var imcHomem = (72.7 *alt) - 58;
            var imcMulher =(62.1  *alt) - 44.7;
            if (cxHomem.isChecked){
                mensagem = "O peso ideal é ${imcHomem}"
                Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
            }else if (cxMulher.isChecked){
                mensagem = "O peso ideal é ${imcMulher}"
                Toast.makeText(this,mensagem,Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Defina o sexo", Toast.LENGTH_LONG).show()
            }
        }

}
}