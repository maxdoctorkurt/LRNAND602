package com.example.lrnand602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lrnand602.dagger.AppComponent
import com.example.lrnand602.dagger.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var app: App

    init {
        getAppComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        app.printBlaBla()
    }

    private fun getAppComponent(): AppComponent {
        return App.instance.getApplicationComponent()
    }
}
