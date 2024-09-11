package com.example.primenumbers

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find TextView in layout
        val textView: TextView = findViewById(R.id.textView)
        // Get prime numbers in the first 20 natural numbers
        val primeNumber = getPrimeNumbersInFirst20()
        //Display the prime numbers in the TextView
        textView.text = "Prime Numbers: $primeNumber"
    }
    // Function to check if a number is prime
    private fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }
    // Function to get prime numbers in the first 20 natural numbers
    private fun getPrimeNumbersInFirst20(): List<Int> {
        val primes = mutableListOf<Int>()
        for (i in 0..20) {
            if (isPrime(i)) {
                primes.add(i)
            }
        }
        return primes
    }
}