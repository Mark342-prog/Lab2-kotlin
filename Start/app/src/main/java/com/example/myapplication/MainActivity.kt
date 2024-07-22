package com.example.myapplication

import android.os.Bundle
import android.renderscript.Int2
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
fun promedio(numbers: List<Int>): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    val average = sum / numbers.size
    return average
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val num = listOf(10, 2, 3, 40, 5)
        Log.i("List test", promedio(num).toString())
        val numbersArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val oddArray = numbersArray.filter{ it % 2 != 0 }
        Log.i("List test",oddArray.toString())
        fun isPalindrome(x: Int): Boolean {
            val original = x.toString()
            val rever = original.reversed()
            return original == rever
        }
        Log.i("Palidrome", isPalindrome(12321).toString())
        fun performOperation(int: Int, int2: Int, op:String): Int {
            when (op) {
                "+" -> return (int + int2)
                "-" -> return  (int - int2)
                else -> {return 0}
            }
        }
        Log.i("operation", performOperation(5,5,"+").toString())
    }
}
