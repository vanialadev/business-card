package br.com.vaniala.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.vaniala.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}